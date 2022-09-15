package az.rock.waffle.ws.domain.applicationService.mapper;

import az.rock.waffle.ws.domain.applicationService.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.create.CreateUserResponse;
import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.valueObject.UserId;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {
    public User createUserCommandToUser(CreateUserCommand createUserCommand) {
        return new User(new UserId(createUserCommand.getCustomerId()),
                createUserCommand.getUsername(),
                createUserCommand.getFirstName(),
                createUserCommand.getLastName());
    }

    public CreateUserResponse userToCreateUserResponse(User customer, String message) {
        return new CreateUserResponse(customer.getId().getValue(), message);
    }
}