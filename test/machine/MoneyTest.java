package machine;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private MoneyHandler moneyHandler;

	@Before
	public void setup() {
		moneyHandler = new MachineMoneyHandler();
	}

	@Test
	public void receiveShouldIncreaseAmount() {
		Payment payment = new MachineMoneyHandlerPayment();
		BigDecimal amountBefore = moneyHandler.getAmount();
		moneyHandler.receiveMoney(payment);

		assertEquals(payment.amount(),
				moneyHandler.getAmount().subtract(amountBefore));
	}

	@Test
	public void dispensingMoneyShouldDecreaseAmount() {
		BigDecimal amountDispensed = BigDecimal.valueOf(1.0);
		BigDecimal amountBefore = moneyHandler.getAmount();
		moneyHandler.changeMoney(amountDispensed);

		assertEquals(amountDispensed,
				amountBefore.subtract(moneyHandler.getAmount()));
	}
}
