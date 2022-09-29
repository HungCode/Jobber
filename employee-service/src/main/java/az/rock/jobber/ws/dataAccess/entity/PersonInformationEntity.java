package az.rock.jobber.ws.dataAccess.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonInformationEntity extends MetaData {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne
    private ResumeEntity employee;

    private String name;

    private String lastName;

    @Column(columnDefinition = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private LocalDate birthDay;

    private String wasBorn;

    private String nowLive;

    @OneToMany
    private List<ContactEntity> contacts;

    @OneToMany
    private List<AddressEntity> addresses;

}
