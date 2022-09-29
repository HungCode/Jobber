package az.rock.jobber.ws.dataAccess.entity.resume;

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
public class LocationEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne
    private EducationEntity  education;

    private String country;

    private String city;
}
