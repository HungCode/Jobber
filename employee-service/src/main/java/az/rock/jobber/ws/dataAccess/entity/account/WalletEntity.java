package az.rock.jobber.ws.dataAccess.entity.account;

import az.rock.jobber.ws.valueObject.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletEntity {
    @Id
    @GeneratedValue
    private UUID uuid;

    @OneToOne
    private AccountEntity account;

    private BigDecimal debit;

    private BigDecimal credit = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private Currency currency;
}
