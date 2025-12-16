import javax.swing.*;

public class Lab506 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
        if (is_prime_number(number)){
            JOptionPane.showMessageDialog(null,number+" is Prime number");
        }else {
            JOptionPane.showMessageDialog(null,number+" is NOT Prime number");
        }





    }

    public static boolean is_prime_number(int number){
        for (int i = 2;i < number;i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }


}

