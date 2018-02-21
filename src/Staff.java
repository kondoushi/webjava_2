
public class Staff extends AbstractEmployee{
	private static final int COST_STAFF = 20;

	public Staff() {
		super();
		this.position = "スタッフ";
		setCost(COST_STAFF);
	}

	@Override
	protected void createClient() {
		super.customer =  new NormalCustomer();

	}

	@Override
	protected void contract() {
		customer.sign(super.contract);
		super.contract.setCosts(super.cost);
	}

}
