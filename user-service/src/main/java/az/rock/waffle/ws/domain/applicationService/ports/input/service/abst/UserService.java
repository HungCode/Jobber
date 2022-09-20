package az.rock.waffle.ws.domain.applicationService.ports.input.service.abst;

import az.rock.waffle.ws.domain.applicationService.create.CreateUserCommand;
import az.rock.waffle.ws.domain.applicationService.create.CreateUserResponse;

import javax.validation.Valid;

public interface UserService {
    CreateUserResponse createUser(@Valid CreateUserCommand userCommand);
}