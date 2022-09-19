package az.rock.waffle.ws.dataAccess.mapper;

import az.rock.waffle.ws.dataAccess.entity.UserEntity;
import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.valueObject.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDataAccessMapper {

    private final PasswordEncoder passwordEncoder;

    public User userEntityToUser(UserEntity userEntity) {
        return new User(new UserId(userEntity.getId()),
                userEntity.getUsername(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getPassword(),
                userEntity.getEmail()
        );
    }

    public UserEntity userToUserEntity(User user) {
        return UserEntity.builder()
                .id(user.getId().getValue())
                .username(user.getUsername())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .password(this.passwordEncoder.encode(user.getPassword()))
                .build();
    }
}
