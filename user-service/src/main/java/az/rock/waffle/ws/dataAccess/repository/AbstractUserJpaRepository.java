package az.rock.waffle.ws.dataAccess.repository;

import az.rock.waffle.ws.dataAccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AbstractUserJpaRepository extends JpaRepository<UserEntity, UUID> {


}