import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();

        System.out.print("Enter minute: ");
        int min = scanner.nextInt();

        int sum = hour * 60;

        System.out.println("Total time is " + (sum+min) + " minutes");

    }
}
