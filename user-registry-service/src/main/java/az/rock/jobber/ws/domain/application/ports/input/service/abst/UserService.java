package az.rock.jobber.ws.domain.application.ports.input.service.abst;

import az.rock.jobber.ws.domain.application.dto.create.CreateUserCommand;
import az.rock.jobber.ws.domain.application.dto.create.CreateUserResponse;

import javax.validation.Valid;

public interface UserService {
    CreateUserResponse createUser(@Valid CreateUserCommand userCommand);
}
