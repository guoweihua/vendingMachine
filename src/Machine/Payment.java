package machine;

import java.math.BigDecimal;

public interface Payment {

	String type = null;

	public BigDecimal amount();
	
	public void setAmount(BigDecimal amount);
}
