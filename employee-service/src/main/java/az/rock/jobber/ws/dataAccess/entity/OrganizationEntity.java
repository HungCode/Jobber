package az.rock.jobber.ws.dataAccess.entity;

import az.rock.jobber.ws.valueObject.DegreeType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne
    private EducationEntity education;

    private String name;

    private String faculty;

    @Enumerated(value = EnumType.STRING)
    private DegreeType degree;
}
