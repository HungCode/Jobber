package az.rock.waffle.ws.dataAccess.mapper;

import az.rock.waffle.ws.dataAccess.entity.UserEntity;
import az.rock.waffle.ws.domain.core.aggregate.UserRoot;
import az.rock.waffle.ws.domain.valueObject.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDataAccessMapper {

    private final PasswordEncoder passwordEncoder;

    public UserRoot userEntityToUser(UserEntity userEntity) {
        return new UserRoot(new UserId(userEntity.getId()),
                userEntity.getUsername(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }

    public UserEntity userToUserEntity(UserRoot userRoot) {
        return UserEntity.builder()
                .id(userRoot.getId().getValue())
                .username(userRoot.getUsername())
                .firstName(userRoot.getFirstName())
                .lastName(userRoot.getLastName())
                .email(userRoot.getEmail())
                .password(this.passwordEncoder.encode(userRoot.getPassword()))
                .build();
    }
}
