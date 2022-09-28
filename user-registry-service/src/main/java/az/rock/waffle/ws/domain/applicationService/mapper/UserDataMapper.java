package az.rock.waffle.ws.domain.applicationService.mapper;

import az.rock.waffle.ws.domain.applicationService.dto.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.dto.create.CreateUserResponse;
import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {
    public UserRoot createUserCommandToUser(CreateUserCommand createUserCommand) {
        return new UserRoot(new UserId(createUserCommand.getCustomerId()),
                createUserCommand.getUsername(),
                createUserCommand.getFirstName(),
                createUserCommand.getLastName(),
                createUserCommand.getPassword(),
                createUserCommand.getEmail(),createUserCommand.getUserType()
        );
    }

    public CreateUserResponse userToCreateUserResponse(UserRoot customer, String message) {
        return new CreateUserResponse(customer.getId().getValue(), message);
    }
}