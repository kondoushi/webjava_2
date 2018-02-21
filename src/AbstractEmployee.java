public abstract class AbstractEmployee {
	protected String position;

	//契約書
	protected Contract contract;

	//顧客
	protected AbstractCustomer customer;

	//費用
	protected int cost = 0;

	//コンストラクタ
	AbstractEmployee() {
		this.contract = new Contract();
	}

	protected abstract void createClient();
	protected abstract void contract();

	//setter
	protected void setCost(int cost) {
		this.cost = cost;
	}

	//getter
	public int getCost() {
		return this.cost;
	}

	//契約書を返却する
	public Contract work() {
		createClient();
		contract();
		return contract;
	}

	public String getPosition() {
		return position;
	}
}
