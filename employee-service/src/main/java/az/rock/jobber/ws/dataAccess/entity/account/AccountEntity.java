package az.rock.jobber.ws.dataAccess.entity.account;

import az.rock.jobber.ws.dataAccess.entity.EmployeeEntity;
import az.rock.jobber.ws.dataAccess.entity.resume.MetaData;
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
public class AccountEntity extends MetaData {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne
    private EmployeeEntity employee;

    @OneToOne
    private WalletEntity money;
}
