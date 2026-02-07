import javax.swing.*;
import java.util.Scanner;

public class CheckOrder3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(JOptionPane.showInputDialog(null,"How many pounds do you want?"));
        String flavor = JOptionPane.showInputDialog(null,"Enter a flavor birthday cake:");
        String message = JOptionPane.showInputDialog(null,"Enter a message on cake:");

        BirthdayCake birthdayCake = new BirthdayCake(message,pound,flavor,400);

        while (true){
            int confirm = JOptionPane.showConfirmDialog(null,birthdayCake+"\n\nConfirm this order?");

            if (confirm == 0){
                JOptionPane.showMessageDialog(null,birthdayCake);
                break;
            }
            else {
                String correctMessage = JOptionPane.showInputDialog(null,"Enter a new message for changing:");
                birthdayCake = new BirthdayCake(correctMessage,pound,flavor,400);
            }

        }
    }
}
