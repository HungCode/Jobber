package az.rock.jobber.ws.dataAccess.repository.adapter;

import az.rock.jobber.ws.dataAccess.mapper.UserDataAccessMapper;
import az.rock.jobber.ws.dataAccess.repository.AbstractUserJpaRepository;
import az.rock.jobber.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepository  implements AbstractUserRepository {

    private final AbstractUserJpaRepository userJpaRepository;
    private final UserDataAccessMapper userDataAccessMapper;


    @Override
    public UserRoot createUser(UserRoot userRoot) {
        return this.userDataAccessMapper
                .userEntityToUser(this.userJpaRepository
                        .save(this.userDataAccessMapper
                                .userToUserEntity(userRoot)));
    }

    @Override
    public UserRoot findByUsername(String userName) {
        return this.userDataAccessMapper
                .userEntityToUser(this.userJpaRepository.findByUsername(userName));
    }


}
