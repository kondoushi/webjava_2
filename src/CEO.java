
public class CEO extends AbstractEmployee{
	private final static int COST_CEO = 80;

	public CEO() {
		super();
		this.position = "CEO";
		setCost(COST_CEO);
	}

	@Override
	protected void createClient() {
		super.customer = new RoyalCustomer();
	}

	@Override
	protected void contract() {
		customer.sign(super.contract);
		super.contract.setCosts(super.cost);
	}

}
