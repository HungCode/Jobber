package az.rock.waffle.ws.dataAccess.repository.adapter;

import az.rock.waffle.ws.dataAccess.mapper.UserDataAccessMapper;
import az.rock.waffle.ws.dataAccess.repository.AbstractUserJpaRepository;
import az.rock.waffle.ws.domain.applicationService.ports.output.repository.AbstractUserRepository;
import az.rock.waffle.ws.domain.core.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@RequiredArgsConstructor
public class UserRepository  implements AbstractUserRepository {

    private final AbstractUserJpaRepository userJpaRepository;
    private final UserDataAccessMapper userDataAccessMapper;


    @Override
    public User createUser(User user) {
        return this.userDataAccessMapper
                .UserEntityToUser(this.userJpaRepository
                        .save(this.userDataAccessMapper
                                .UserToUserEntity(user)));
    }
}
