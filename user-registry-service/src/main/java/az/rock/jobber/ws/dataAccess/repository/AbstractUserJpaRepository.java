package az.rock.jobber.ws.dataAccess.repository;

import az.rock.jobber.ws.dataAccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AbstractUserJpaRepository extends JpaRepository<UserEntity, UUID> {
    UserEntity findByUsername(String userName);
}