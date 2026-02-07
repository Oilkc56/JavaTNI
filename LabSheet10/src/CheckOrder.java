import java.util.Scanner;

public class CheckOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //no1
        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.nextLine();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        //no2
        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);

        //no3
        System.out.println(order1);

        System.out.println("\nCup Cake's Details: ");
        System.out.print("Enter a flavor: ");
        String flavor2 = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        //no2
        CupCake order2 = new CupCake(piece,flavor2,65);

        //no3
        System.out.println(order2);

        System.out.println("\nGrassJelly's Details: ");
        System.out.print("Enter a flavor: ");
        String flavor3 = scanner.next();
        System.out.print("How many bowl: ");
        int bowl = scanner.nextInt();
        System.out.print("Do you want brownsugar topping? (yes/no) = ");
        String brownsugar = scanner.next();

        //no2
        GrassJelly order3 = new GrassJelly(flavor3,40,brownsugar,bowl);

        //no3

        System.out.println(order3);




        System.out.println("Total price = " + (order1.calculateTotalPrice()+order2.calculateTotalPrice()+order3.calculateTotalPrice()));


    }

}