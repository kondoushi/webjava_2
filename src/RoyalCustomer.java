import java.util.Random;

public class RoyalCustomer extends AbstractCustomer{

	@Override
	protected Contract makeContract(Contract contract) {
		int amount = 0;
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		if (randomNum <= 70) {
			amount = 200;
		}else {
			amount = 0;
		}
		contract.setEarnings(amount);

		return contract;
	}

}
