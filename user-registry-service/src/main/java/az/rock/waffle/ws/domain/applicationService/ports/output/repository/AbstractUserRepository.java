package az.rock.waffle.ws.domain.applicationService.ports.output.repository;

import az.rock.waffle.ws.domain.core.aggregate.UserRoot;

public interface AbstractUserRepository {
    UserRoot createUser(UserRoot userRoot);
    UserRoot findByUsername(String userName);
}
