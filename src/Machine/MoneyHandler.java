package machine;

import java.math.BigDecimal;

public interface MoneyHandler {

    public void receiveMoney(Payment payment);

    public void changeMoney(BigDecimal amountDispensed);

    public BigDecimal getAmount();

	public boolean verifyPayment(Payment payment);

}
