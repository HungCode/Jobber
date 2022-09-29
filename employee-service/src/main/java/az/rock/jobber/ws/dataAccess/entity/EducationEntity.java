package az.rock.jobber.ws.dataAccess.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EducationEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @ManyToOne
    private ResumeEntity resume;

    private String context;

    @OneToOne
    private OrganizationEntity organization;

    @OneToOne
    private LocationEntity location;

    @Column(columnDefinition = "START_DATE")
    @Temporal(TemporalType.DATE)
    private LocalDate startDate;

    @Column(columnDefinition = "END_DATE")
    @Temporal(TemporalType.DATE)
    private LocalDate endDate;

    @Lob
    private Byte[] file;

    private String specialNote;

}
