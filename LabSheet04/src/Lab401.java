import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your full name:");

        int index = name.indexOf(" ");

        while (name.trim().indexOf(" ") == -1){
            name = JOptionPane.showInputDialog("Enter your full name:");

        }
        JOptionPane.showMessageDialog(null,"Welcome, " + name.toUpperCase().charAt(0) +
                name.substring(1, index) +" "+ name.toUpperCase().substring(index+1,name.length()-1));


    }

}
