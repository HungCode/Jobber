package az.rock.jobber.ws.valueObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


public class Money {
    private final static Money ZERO = new Money();

    public static Boolean isZero(Money money){
        return money.amount.compareTo(BigDecimal.ZERO) == 0;
    }

    private final BigDecimal amount;
    private final Integer scale = 2;

    public Money(BigDecimal amount) {
        this.amount = amount.setScale(this.scale, RoundingMode.HALF_DOWN);
    }

    public Money() {
        this.amount = BigDecimal.ZERO;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Money add(Money money){
        return new Money(this.amount.add(money.getAmount()));
    }

    public Money subtract(Money money){
        return new Money(this.amount.subtract(money.getAmount()));
    }

    public Money multiply(BigDecimal decimal){
        return new Money(this.amount.multiply(decimal));
    }

    public Money division(BigDecimal divisor){
        return new Money(this.amount.divide(divisor,RoundingMode.FLOOR).setScale(this.scale,RoundingMode.HALF_DOWN));
    }

    public Boolean isEquals(Money money){
        return this.amount.compareTo(money.amount) == 0;
    }

    public Boolean isGreater(Money money){
        return this.amount.compareTo(money.amount) > 0;
    }

    public Boolean isGreaterOrEquals(Money money){
        return this.amount.compareTo(money.amount) >= 0;
    }


}
