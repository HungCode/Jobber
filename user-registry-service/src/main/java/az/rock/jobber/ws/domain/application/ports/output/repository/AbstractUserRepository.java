package az.rock.jobber.ws.domain.application.ports.output.repository;

import az.rock.jobber.ws.domain.core.aggregate.UserRoot;

public interface AbstractUserRepository {
    UserRoot createUser(UserRoot userRoot);
    UserRoot findByUsername(String userName);
}
