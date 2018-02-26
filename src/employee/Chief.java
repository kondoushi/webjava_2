package employee;
import customer.GoodCustomer;

public class Chief extends AbstractEmployee{
	private final static int COST_CHIEF = 40;

	public Chief() {
		super();
		setPosition("チーフ");
		setCost(COST_CHIEF);
	}

	@Override
	protected void createClient() {
		super.customer = new GoodCustomer();
	}
}
