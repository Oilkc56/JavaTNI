import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {
        product p1 =  new product();

        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");
        p1.name = JOptionPane.showInputDialog("Enter product name:");
        p1.price = Integer.parseInt(JOptionPane.showInputDialog("Enter product price per item"));
        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));
        p1.showInfo();
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to add more item?");
        if(confirm == 0){

            p1.addStock(Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:")));


        }
        confirm = JOptionPane.showConfirmDialog(null,"Do you want to Do you want to change price?");
        if(confirm == 0){

            p1.changePrice(Integer.parseInt(JOptionPane.showInputDialog("HOw much is the new price per item?")));

        }
        p1.showInfo();
    }
}