package Banking;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public abstract class BankSystem2 extends BankAccount implements Transactionable{
    static Scanner scanner = new Scanner(System.in);
    static void main() throws IOException {
        System.out.print("Enter your bank account: ");
        String acc_Id = scanner.next();
        int menu_num = 0;
        double amount = 0.0;

        AccountTransaction account = new AccountTransaction(acc_Id);

        if (account.hasAccountId()){
            System.out.println("\nPress 1 to deposit" +
                    "\nPress 2 to withdraw" +
                    "\nPress 3 to check balance" +
                    "\nPress 4 to exit");

            while (true){
                System.out.print("\nEnter menu: ");
                menu_num = scanner.nextInt();
                if (menu_num == 1){
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    System.out.println("Your balance = " + account.checkBalance());
                }
                if (menu_num == 2 ){
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextInt();
                    account.withdraw(amount);
                    System.out.println("You balance = " +account.checkBalance());
                }
                if (menu_num == 3){
                    System.out.print("You balance = " + account.checkBalance());
                }
                if (menu_num == 4) {
                    break;
                }

            }

        }else {
            System.out.println("Bank account not found...");
        }


    }
}
