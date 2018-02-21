
public class IncomeStatement extends AbstractDocument{
	//売上
	private int revenue = 0;
	//費用
	private int expense = 0;
	//収益
	private int profit = 0;

	/**
	 * コンストラクタ
	 */
	public IncomeStatement() {
		super.docName = "損益計算書";
	}

	public int getRevenue() {
		return this.revenue;
	}

	public int getExpense() {
		return this.expense;
	}

	public int getProfit() {
		this.profit = (revenue - expense);
		return this.profit;
	}

	public void addRevenue(int revenue) {
		this.revenue += revenue;
	}

	public void addExpense(int expense) {
		this.expense += expense;
	}


}
