import java.util.Random;

public class GoodCustomer extends AbstractCustomer{

	@Override
	protected Contract makeContract(Contract contract) {
		int amount = 0;
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		if (randomNum <= 50) {
			amount = 60;
		}else if(50 <randomNum && randomNum <= 80){
			amount = 70;
		}else if(80 < randomNum && randomNum <= 90) {
			amount = 80;
		}else if(90 < randomNum){
			amount = 30;
		}
		contract.setEarnings(amount);

		return contract;
	}

}
