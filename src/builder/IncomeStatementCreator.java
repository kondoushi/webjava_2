package builder;
import document.IncomeStatement;

public class IncomeStatementCreator {
	private Builder builder;

	public IncomeStatementCreator(Builder builder) {
		this.builder = builder;
	}

	public IncomeStatement construct() {
		return (IncomeStatement) builder.create();
	}
}
