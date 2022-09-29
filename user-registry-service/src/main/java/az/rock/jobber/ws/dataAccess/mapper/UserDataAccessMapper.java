package az.rock.jobber.ws.dataAccess.mapper;

import az.rock.jobber.ws.dataAccess.entity.UserEntity;
import az.rock.jobber.ws.domain.core.aggregate.UserRoot;
import az.rock.jobber.ws.domain.valueObject.UserId;
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
                userEntity.getEmail(),
                userEntity.getUserType()
        );
    }

    public UserEntity userToUserEntity(UserRoot userRoot) {
        return UserEntity.builder()
                .id(userRoot.getId().getValue())
                .finIdentify(userRoot.getFinIdentify())
                .userType(userRoot.getUserType())
                .username(userRoot.getUsername())
                .firstName(userRoot.getFirstName())
                .lastName(userRoot.getLastName())
                .email(userRoot.getEmail())
                .password(this.passwordEncoder.encode(userRoot.getPassword()))
                .build();
    }
}
