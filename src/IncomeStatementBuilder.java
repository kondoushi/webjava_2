import java.util.ArrayList;

public class IncomeStatementBuilder implements Builder{
	private ArrayList<Contract> contractArray = new ArrayList<>();

	@Override
	public void setDoc(Contract doc) {
		contractArray.add(doc);

	}

	@Override
	public IncomeStatement create() {
		IncomeStatement incomeStatement = new IncomeStatement();

		for(Contract contract : contractArray) {
			incomeStatement.addRevenue(contract.getEarnings());
			incomeStatement.addExpense(contract.getCosts());
		}
		return incomeStatement;
	}

}
