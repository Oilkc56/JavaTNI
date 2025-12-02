import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double price;
        double total_price = 0;
        do {
            price = Double.parseDouble(JOptionPane.showInputDialog(null,"Input price [press 0 to stop]:"));
            if (price < 0){
                JOptionPane.showMessageDialog(null,"Invalid price!!");
                continue;
            }
            total_price += price;
        }while (price != 0);
        JOptionPane.showMessageDialog(null,"Total price is "+ total_price +" baht.");

    }
}
