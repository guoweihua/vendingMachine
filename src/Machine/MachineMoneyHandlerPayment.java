package machine;

import java.math.BigDecimal;

public class MachineMoneyHandlerPayment implements Payment {

	private BigDecimal amount = new BigDecimal(0);
	
	@Override
	public BigDecimal amount() {
		return this.amount;
	}

	@Override
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
