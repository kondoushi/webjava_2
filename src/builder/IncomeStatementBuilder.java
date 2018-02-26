package builder;
import java.util.ArrayList;
import document.AbstractDocument;
import document.Contract;
import document.IncomeStatement;

public class IncomeStatementBuilder implements Builder{
	private ArrayList<Contract> contractArray = new ArrayList<>();

	@Override
	public void setDoc(AbstractDocument doc) {
	  Contract contract = (Contract)doc;
		this.contractArray.add(contract);
	}

	@Override
	public IncomeStatement create() {
		IncomeStatement incomeStatement = new IncomeStatement();

		for(int i = 0; i < contractArray.size();i++) {
			incomeStatement.addRevenue(contractArray.get(i).getEarnings());
			incomeStatement.addExpense(contractArray.get(i).getCosts());
		}

		return incomeStatement;
	}

}
