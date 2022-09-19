package az.rock.waffle.ws.domain.applicationService.ports.output.repository;

import az.rock.waffle.ws.domain.core.entity.User;

public interface UserRepository {
    User createUser(User user);
}
