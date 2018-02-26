package customer;
import java.util.Random;

public class NormalCustomer extends AbstractCustomer{

	@Override
	protected void work() {
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		if (randomNum <= 50) {
		  super.amount = 20;
		}else if(50 <randomNum && randomNum <= 80){
		  super.amount = 40;
		}else if(80 < randomNum && randomNum <= 90) {
		  super.amount = 50;
		}else if(90 < randomNum){
		  super.amount = 0;
		}
	}

}
