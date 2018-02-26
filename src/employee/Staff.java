package employee;
import customer.NormalCustomer;

public class Staff extends AbstractEmployee{
	private static final int COST_STAFF = 20;

	public Staff() {
		super();
		setPosition("スタッフ");
		setCost(COST_STAFF);
	}

	@Override
	protected void createClient() {
		super.customer =  new NormalCustomer();

	}
}
