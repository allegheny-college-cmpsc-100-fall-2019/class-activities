package blackbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ATM {
  
  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/balances.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    int opening = input.nextInt();
    BankAccount account = new BankAccount(opening);
    String response = new String();
    input = new Scanner(System.in);
    do {
      int amount;
      System.out.print("(D)eposit, (W)ithdraw, (E)nd: ");
      response = input.next();
      switch(response) {
        case "D":
          System.out.print("Amount to deposit: ");
          amount = (int)input.nextDouble();
          account.deposit(amount);
          break;
        case "W":
          System.out.print("Amount to withdraw: ");
          amount = (int)input.nextDouble();
          account.withdraw(amount);
          break;
        default:
          break;
      }
      input.nextLine();
    }
    while (!response.equalsIgnoreCase("e"));
    System.out.println(account);
  }
}