import static constants.ConstantPrintMsg.*;

import java.util.Scanner;

public class SimulationSystem {
	// 予算の定義値
	private final static int BUDGET = 100;

	private static Scanner scanner = new Scanner(System.in);
	// 売上表を生成する為のBuilder
	private Builder builder;

	// 予算100万円
	private int budget = BUDGET;

	private Staff staff;
	private Chief chief;
	private CEO ceo;

	/**
	 * コンストラクタ
	 */
	public SimulationSystem() {
		this.builder = new IncomeStatementBuilder();
		this.staff = new Staff();
		this.chief = new Chief();
		this.ceo = new CEO();
	}

	/**
	 * 実行メソッド
	 */
	public void run() {
		printsStartMsg();
		int mode = 0;
		do {
			// 予算表示
			printBudget(budget);
			printsSlectEmployee();
			// 予算の残高に応じて表示するコマンドを変更する
			if (budget >= 80) {
				mode = 101;
				print101Command();
			} else if (budget >= 40) {
				mode = 102;
				print102Command();
			} else if (budget >= 20) {
				mode = 103;
				print103Command();
			}

			// 入力待ち
			String input = scanner.next();

			// 入力文字列が1~3であるかチェック
			if (inputCheck(input)) {
				runFlow(mode, input);
			} else {
				printInputFailed();
			}
		} while (budget != 0);

		// 売上を計算する
		IncomeStatementCreator incomeStatementCreator = new IncomeStatementCreator(builder);
		IncomeStatement incomeStatement = incomeStatementCreator.construct();

		println("--結果--");
		println("総売上: " + incomeStatement.getRevenue() + "万円");
		println("総費用: " + incomeStatement.getExpense() + "万円");
		println("総利益: " + incomeStatement.getProfit() + "万円");
		println("--------");
		printsEndMsg();
	}

	/**
	 * 入力された文字チェック
	 *
	 * @param input
	 * @return
	 */
	private boolean inputCheck(String input) {
		boolean res = false;
		if (input.equals("1"))
			res = true;
		if (input.equals("2"))
			res = true;
		if (input.equals("3"))
			res = true;
		return res;
	}

	/**
	 * オブジェクトの操作
	 *
	 * @param mode
	 * @param input
	 */
	private void runFlow(int mode, String input) {
		if (mode == 101) {
			switch (input) {
			case "1":
				workStaff();
				break;
			case "2":
				workChief();
				break;
			case "3":
				workCEO();
				break;
			}
		}

		if (mode == 102) {
			switch (input) {
			case "1":
				workStaff();
				break;
			case "2":
				workChief();
				break;
			default:
				printOverBudget();
				break;
			}
		}

		if (mode == 103) {
			switch (input) {
			case "1":
				workStaff();
				break;

			default:
				printOverBudget();
				break;
			}
		}
	}

	/**
	 * Staffオブジェクトの動作メソッド
	 */
	private void workStaff() {
		budget -= this.staff.getCost();
		Contract contract = staff.work();
		builder.setDoc(contract);
		printDummy();
		// 結果表示
		showEmployeeResult(staff);
	}

	/**
	 * Chiefオブジェクトの動作メソッド
	 */
	private void workChief() {
		budget -= chief.getCost();
		Contract contract = chief.work();
		builder.setDoc(contract);
		printDummy();
		// 結果表示
		showEmployeeResult(chief);
	}

	/**
	 * CEOオブジェクトの動作メソッド
	 */
	private void workCEO() {
		budget -= ceo.getCost();
		Contract contract = ceo.work();
		builder.setDoc(contract);
		printDummy();
		// 結果表示
		showEmployeeResult(ceo);
	}

	/**
	 * 従業員の成績表示
	 *
	 * @param employee
	 */
	private void showEmployeeResult(AbstractEmployee employee) {
		if (employee.contract.getEarnings() == 0) {
			println(employee.getPosition() + "は、契約に失敗しました。売上は、" + employee.contract.getEarnings() + "円です。");
			println("---------------------------------------------");
			println("");
		} else {
			println(employee.getPosition() + "の売上は、" + employee.contract.getEarnings() + "万円です。");
			println("---------------------------");
			println("");
		}
	}
}
