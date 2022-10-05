package az.rock.jobber.ws.domain.application.mapper;

import az.rock.jobber.ws.domain.application.dto.create.CreateUserCommand;
import az.rock.jobber.ws.domain.application.dto.create.CreateUserResponse;
import az.rock.jobber.ws.domain.valueObject.UserId;
import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {
    public UserRoot createUserCommandToUser(CreateUserCommand createUserCommand) {
        return new UserRoot(new UserId(createUserCommand.getUserUUID()),
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