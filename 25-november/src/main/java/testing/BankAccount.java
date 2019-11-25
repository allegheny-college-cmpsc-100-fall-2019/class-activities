package blackbox;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class BankAccount {

  private double balance;
  private ArrayList<Double> transactions;
  private Locale gb = new Locale("en","GB");
  private NumberFormat fmt = NumberFormat.getCurrencyInstance(gb);
  
  /** Constructor.
   *
   * @param amount Amount with which to open account
   */
  public BankAccount(int amount) {
    transactions = new ArrayList<Double>();
    boolean isAllowed = allowed(amount, "OPENING BALANCE");
    if(isAllowed) {
      this.balance = amount;
    }
  }
  
  /** Makes a deposit.
   *
   * @param amount Amount to deposit
   */
  public void deposit(int amount) {
    boolean isAllowed = allowed(amount, "DEPOSIT");
    if (isAllowed) {
      this.balance += amount;
    }
  }
  
  /** Makes a withdrawal.
   *
   * @param amount Amount to withdraw
   */
  public void withdraw(double amount) {
    boolean isAllowed = allowed(amount, "WITHDRAWL");
    if (isAllowed) {
      this.balance -= amount;
    }
  }
  
  private boolean allowed(double amount,String source) {
    if (amount >= this.balance) {
      System.out.println(source + " OK");
      record(amount);
      return true;
    }
    return false;
  }
  
  private void record(double amount) {
    this.transactions.add(amount);
  }
  
  /** Creates string representation of object.
   *
   */
  public String toString() {
    String report = new String();
    report += "A summary of your transactions:\n";
    for (int i = 0; i < this.transactions.size(); i++) {
      report += this.fmt.format(this.transactions.get(i)) + "\n";
    }
    report += "Your balance is: " + this.fmt.format(this.balance);
    return report;
  }
}