import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
        final double price_per_head = 299;

        DecimalFormat frm = new DecimalFormat("#.00");

        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        double sum_price = (customer * price_per_head) + ((price_per_head * customer) * 0.07);

        double discount_input = Double.parseDouble(JOptionPane.showInputDialog("Price with NET is " + sum_price + " baht.\nHow much of discount (%) on your coupon?"));

        double total_price = sum_price - (sum_price * (discount_input/100));
        double paid_input = Double.parseDouble(JOptionPane.showInputDialog("Total price is " + frm.format(total_price) + " baht.\nEnter the amount the customer paid:"));

        JOptionPane.showMessageDialog(null,"Total price is " + frm.format(total_price) + " baht." + "\nCustomer paid " + frm.format(paid_input) + " baht." + "\nGet change " + frm.format(paid_input - total_price) + " baht.");


    }
}
