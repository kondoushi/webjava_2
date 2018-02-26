package customer;
import java.util.Random;

public class RoyalCustomer extends AbstractCustomer{

	@Override
	protected void work() {
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		if (randomNum <= 70) {
			super.amount = 200;
		}else {
			super.amount = 0;
		}
	}

}
