package document;
public class Contract extends AbstractDocument{
	//売上
	private int earnings;

	//経費
	private int costs;

	public Contract() {
		super.docName = "契約書";
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public void setCosts(int costs) {
		this.costs = costs;
	}

	public int getEarnings() {
		return this.earnings;
	}

	public int getCosts() {
		return this.costs;
	}

}
