package az.rock.waffle.ws.domain.applicationService.ports.output.repository;

import az.rock.waffle.ws.domain.core.entity.User;

public interface AbstractUserRepository {
    User createUser(User user);
}
