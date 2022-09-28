package az.rock.waffle.ws.dataAccess.repository.adapter;

import az.rock.waffle.ws.dataAccess.mapper.UserDataAccessMapper;
import az.rock.waffle.ws.dataAccess.repository.AbstractUserJpaRepository;
import az.rock.waffle.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
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
