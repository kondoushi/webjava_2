package system;

import static constants.ConstantPrintMsg.*;
import builder.IncomeStatementCreator;
import document.IncomeStatement;
import employee.CEO;
import employee.Chief;
import employee.Staff;

public class SimulationSystem extends AbstractSystemBase {
  // 予算の定義値
  private final static int BUDGET = 100;

  private Staff staff;
  private Chief chief;
  private CEO ceo;

  /**
   * コンストラクタ
   */
  public SimulationSystem() {
    super();
    setBudget(BUDGET);

    this.staff = new Staff();
    this.chief = new Chief();
    this.ceo = new CEO();
  }

  @Override
  public void run() {
    printsStartMsg();
    do {
      // 予算表示
      printBudget(budget);
      printsSlectEmployee();
      // 予算の残高に応じて表示するコマンドを変更する
      if (budget >= 80) {
        print101Command();
        // 入力待ち
        String input = super.scanner.next();
        if (inputCheckAll(input)) {
          runWork(input);
        } else {
          printInputFailed();
        }
      } else if (budget >= 40) {
        print102Command();
        String input = super.scanner.next();
        if (inputCheckRangeTwo(input)) {
          runWork(input);
        }else {
          printInputFailed();
        }

      } else if (budget >= 20) {
        print103Command();
        String input = super.scanner.next();
        if (inputCheckRangeOne(input)) {
          runWork(input);
        }else {
          printInputFailed();
        }
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
    super.scanner.close();
  }


  /**
   * 文字の入力値チェック
   * 範囲：1～3
   * @param input
   * @return
   */
  private boolean inputCheckAll(String input) {
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
   * 文字の入力値チェック
   * 範囲：1～2
   * @param input
   * @return
   */
  private boolean inputCheckRangeTwo(String input) {
    boolean res = false;
    if (input.equals("1"))
      res = true;
    if (input.equals("2"))
      res = true;
    return res;
  }

  /**
   * 文字の入力値チェック
   * 範囲：1
   * @param input
   * @return
   */
  private boolean inputCheckRangeOne(String input) {
    boolean res = false;
    if (input.equals("1"))
      res = true;
    return res;
  }

  /**
   * オブジェクトの操作
   *
   * @param mode
   * @param input
   */
  private void runWork(String input) {
    switch (input) {
      case "1":
        workEmployee(staff);
        break;
      case "2":
        workEmployee(chief);
        break;
      case "3":
        workEmployee(ceo);
        break;
    }
  }
}
