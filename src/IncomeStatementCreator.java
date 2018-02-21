
public class IncomeStatementCreator {
	private Builder builder;

	public IncomeStatementCreator(Builder builder) {
		this.builder = builder;
	}

	public IncomeStatement construct() {
		return builder.create();
	}
}
