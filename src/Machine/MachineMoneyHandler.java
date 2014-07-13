package machine;

import java.math.BigDecimal;

public class MachineMoneyHandler implements MoneyHandler {

    private BigDecimal amount = new BigDecimal(0);

    @Override
    public void changeMoney(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    @Override
    public BigDecimal getAmount() {
        return this.amount;
    }

	@Override
	public void receiveMoney(Payment payment) {
		verifyPayment(payment);
		amount = amount.add(payment.amount());
	}

	@Override
	public boolean verifyPayment(Payment payment) {
		return false;
	}

}
