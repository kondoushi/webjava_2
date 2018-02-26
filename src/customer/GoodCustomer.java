package customer;
import java.util.Random;

public class GoodCustomer extends AbstractCustomer{

    @Override
	protected void work() {
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;

		if (randomNum <= 50) {
		  super.amount = 60;
		}else if(50 <randomNum && randomNum <= 80){
		  super.amount = 70;
		}else if(80 < randomNum && randomNum <= 90) {
		  super.amount = 80;
		}else if(90 < randomNum){
		  super.amount = 30;
		}
		System.out.println("新規顧客　："+ super.amount);
	}

}
