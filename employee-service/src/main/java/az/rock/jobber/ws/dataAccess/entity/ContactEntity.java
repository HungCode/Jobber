package az.rock.jobber.ws.dataAccess.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @ManyToOne
    private PersonInformationEntity personInformation;

    @Email
    private String email;

    private String phoneNumber;
}
