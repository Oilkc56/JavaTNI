import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int min = Integer.parseInt(JOptionPane.showInputDialog("Input minutes:"));
        int hour = min / 60;
        int min_after_cal = min % 60;
        JOptionPane.showMessageDialog(null,min + " minutes is " + hour + " hour " + min_after_cal + " minute");
    }
}
