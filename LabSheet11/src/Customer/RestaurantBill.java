package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        //no1
        String customer_Name = JOptionPane.showInputDialog("Enter customer's name: ");

        //no2
        double bill_amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter customer's bill:")
        );

        //no3
        int is_member = JOptionPane.showConfirmDialog(null,"Do you have a member card?",
                "Member", JOptionPane.YES_NO_OPTION);

        //3-a
        if (is_member == JOptionPane.YES_OPTION){
            String member_level = JOptionPane.showInputDialog(null,"Enter a member level ( Gold/Premium ):");
            Member member = new Member(customer_Name,bill_amount,member_level);
            JOptionPane.showMessageDialog(null,member);
        }else {
            Regular regular = new Regular(customer_Name,bill_amount);
            JOptionPane.showMessageDialog(null,regular);
        }

        //no4



    }
}
