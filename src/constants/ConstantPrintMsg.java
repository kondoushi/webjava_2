package constants;

public class ConstantPrintMsg {

	public static void println(String msg) {
		System.out.println(msg);
	}

	public static void printsStartMsg() {
		System.out.println("システムを開始します。");
	}

	public static void printsEndMsg() {
		System.out.println("システムを終了します。");
	}

	public static void printBudget(int budget) {
		System.out.println("残予算：" + budget);
	}

	public static void printsSlectEmployee() {
		System.out.println("誰を働かせますか？");
		System.out.println("以下のコマンドから選択してください。");
	}

	public static void print101Command() {
		System.out.println("**********");
		System.out.println("1:スタッフ(経費：20)");
		System.out.println("2:チーフ （経費：40)");
		System.out.println("3:CEO    （経費：80）");
		System.out.println("**********");
	}

	public static void print102Command() {
		System.out.println("**********");
		System.out.println("1:スタッフ(経費：20)");
		System.out.println("2:チーフ （経費：40)");
		System.out.println("**********");
	}

	public static void print103Command() {
		System.out.println("**********");
		System.out.println("1:スタッフ(経費：20)");
		System.out.println("**********");
	}

	public static void printOverBudget() {
		System.out.println("予算オーバーです");
	}

	public static void printInputFailed() {
		System.out.println("1～3を入力してください！");
	}

	public static void printDummy() {
		for (int i = 0; i < 3; i++) {
			println("・");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
