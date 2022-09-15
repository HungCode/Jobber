package az.rock.waffle.ws.dataAccess.mapper;

import az.rock.waffle.ws.dataAccess.entity.UserEntity;
import az.rock.waffle.ws.domain.core.entity.User;
import az.rock.waffle.ws.domain.valueObject.UserId;
import org.springframework.stereotype.Component;

@Component
public class UserDataAccessMapper {
    public User UserEntityToUser(UserEntity UserEntity) {
        return new User(new UserId(UserEntity.getId()),
                UserEntity.getUsername(),
                UserEntity.getFirstName(),
                UserEntity.getLastName());
    }

    public UserEntity UserToUserEntity(User User) {
        return UserEntity.builder()
                .id(User.getId().getValue())
                .username(User.getUsername())
                .firstName(User.getFirstName())
                .lastName(User.getLastName())
                .build();
    }
}
