package machine;

import java.math.BigDecimal;

public class Machine {

    private Display display;
    private MoneyHandler moneyHandler;
    private ItemHandler itemHandler;

    public Machine(Display display, MoneyHandler moneyHandler, ItemHandler itemHandler) {
    	this.display = display;
    	this.moneyHandler = moneyHandler;
    	this.itemHandler = itemHandler;
    }

    public Object receivedMoney(Payment payment) {
        moneyHandler.receiveMoney(payment);
        display.show("money " + payment.amount() + " inserted.");
        return null;
    }

    public void dispenseItem() {
        itemHandler.dispenseItem();
        display.show("Item dispensing...");

    }

    public void changeMoney() {
        moneyHandler.changeMoney(new BigDecimal(1.0));
        display.show("Please take your change.");

    }

    public void displayMoneyInserted() {
        // TODO Auto-generated method stub

    }

    public void buyItem() {
        // TODO Auto-generated method stub

    }

}
