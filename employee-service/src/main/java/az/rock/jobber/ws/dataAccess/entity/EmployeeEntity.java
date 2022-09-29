package az.rock.jobber.ws.dataAccess.entity;

import az.rock.jobber.ws.dataAccess.annotation.UserEntity;
import az.rock.jobber.ws.dataAccess.entity.resume.ResumeEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @UserEntity
    private UUID ownerUUID;

    @OneToOne
    private ResumeEntity resume;


}
