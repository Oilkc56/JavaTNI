import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter nubmer 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("");

        DecimalFormat frm = new DecimalFormat("#");

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % num2;

        System.out.println("Summation = " + frm.format(sum) + "\nSubtraction = " + frm.format(sub)
                + "\nMultiplication = " + frm.format(mul) + "\nDivision = " + div
                + "\nModulus = " + frm.format(mod));


    }
}
