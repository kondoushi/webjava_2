package system;

import static constants.ConstantPrintMsg.*;
import java.util.Scanner;
import builder.Builder;
import builder.IncomeStatementBuilder;
import document.Contract;
import employee.AbstractEmployee;

public abstract class AbstractSystemBase {
  protected int budget = 0;
  protected Builder builder;

  protected Scanner scanner = new Scanner(System.in);

  public AbstractSystemBase() {
    this.builder = new IncomeStatementBuilder();
  }

  /*
   * システム実行メソッド
   */
  public abstract void run();

  protected void setBudget(int budget) {
    this.budget = budget;
  }

  protected void workEmployee(AbstractEmployee employee) {
    this.budget -= employee.getCost();
    Contract contract = employee.work();
    builder.setDoc(contract);
    printDummy();
    showEmployeeResult(employee);
  }

  protected void setBuilder(Builder builder) {
    this.builder = builder;
  }

  /**
   * 従業員の成績表示
   *
   * @param employee
   */
  private void showEmployeeResult(AbstractEmployee employee) {
      if (employee.getContract().getEarnings() == 0) {
          println(employee.getPosition() + "は、契約に失敗しました。売上は、" + employee.getContract().getEarnings() + "円です。");
          println("---------------------------------------------");
          println("");
      } else {
          println(employee.getPosition() + "の売上は、" + employee.getContract().getEarnings() + "万円です。");
          println("---------------------------");
          println("");
      }
  }

}
