import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final double LECTURE_PRICE = 1900;
        final double LAB_PRICE = 3500;

        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit : "));
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab credit : "));

        double lecture_total_price = LECTURE_PRICE * lecture_credit;
        double lab_total_price = LAB_PRICE * lab_credit;
        double total_price = lecture_total_price + lab_total_price;

        DecimalFormat frm = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null,"Lecture : " + lecture_credit + "x" + LECTURE_PRICE + "=" + lecture_total_price +
                "\nLab : " + lab_credit + "x" + LAB_PRICE + "=" + lab_total_price + "\nTotal : " + lecture_total_price + "+" + lab_total_price + "=" + total_price);



    }
}
