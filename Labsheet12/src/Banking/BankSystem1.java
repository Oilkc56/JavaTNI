package Banking;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1{
    static Scanner scanner = new Scanner(System.in);
    public static String input_account_id(){

        while (true){
            System.out.print("Enter account id: ");
            String id = scanner.next();
            if (id.length() == 10){
                System.out.println("");
                return id;
            }
        }
    }

    public static double input_initial_balance(){

        boolean is_type_correct = true;
        double amount = 0;
        System.out.print("Enter your initial deposit amount: ");
        while (is_type_correct){
            try {
                amount = scanner.nextDouble();
                is_type_correct = false;
            }
            catch (InputMismatchException e){
                scanner.next();
                System.out.print("Try again!! Enter your initial deposit amount: ");

            }
        }
        return amount;

    }

    static void main() throws IOException {
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();
        OpenNewAccount account = new OpenNewAccount(account_bank,initial_balance);
        System.out.println(account.recordAccount());
    }


}
