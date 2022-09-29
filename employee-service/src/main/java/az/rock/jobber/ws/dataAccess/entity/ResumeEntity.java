package az.rock.jobber.ws.dataAccess.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResumeEntity extends MetaData{
    @Id
    @GeneratedValue
    private UUID uuid;

    private UUID ownerUUID;

    @OneToOne
    private PersonInformationEntity personInformation;

    private String aboutMe;

    @OneToMany
    private List<LinkEntity> links;

    @OneToMany
    private List<EducationEntity> educationList;

    @OneToMany
    private List<CourseEntity> courseList;

}
