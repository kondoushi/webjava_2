package employee;
import customer.RoyalCustomer;

public class CEO extends AbstractEmployee{
	private final static int COST_CEO = 80;

	public CEO() {
		super();
		setPosition("CEO");
		setCost(COST_CEO);
	}

	@Override
	protected void createClient() {
		super.customer = new RoyalCustomer();
	}
}
