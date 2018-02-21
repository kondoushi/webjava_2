
public class Chief extends AbstractEmployee{
	private final static int COST_CHIEF = 40;

	public Chief() {
		super();
		this.position = "チーフ";
		setCost(COST_CHIEF);
	}

	@Override
	protected void createClient() {
		super.customer = new GoodCustomer();
	}

	@Override
	protected void contract() {
		customer.sign(super.contract);
		super.contract.setCosts(super.cost);
	}

}
