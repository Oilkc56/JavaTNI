import java.util.Scanner;

public class CheckOrder2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake" +
                "\nPress 2 to order Cup Cake"+
                "\nPress 3 to order GrassJelly");
        System.out.print("Enter an option: ");
        String option = scanner.next();
        if (option.equalsIgnoreCase("1")){

            String flavor = selectFlavor();
            System.out.print("\nEnter a message on cake: ");
            String message = scanner.next();
            System.out.print("How many pounds: ");
            double pound = scanner.nextDouble();

            BirthdayCake birthdayCake = new BirthdayCake(message,pound,flavor,350);
            System.out.println(birthdayCake);

        }
        else if (option.equalsIgnoreCase("2")){

            String flavor = selectFlavor();
            System.out.print("\nHow many piece: ");
            int piece = scanner.nextInt();

            CupCake cupCake = new CupCake(piece,flavor,70);
            System.out.println(cupCake);

        }
        else if (option.equalsIgnoreCase("3")){

            String flavor = selectFlavor();

            System.out.print("How many bowl: ");
            int bowl = scanner.nextInt();
            System.out.print("Do you want brownsugar topping? (yes/no) = ");
            String brownsugar = scanner.next();


            GrassJelly grassJelly = new GrassJelly(flavor,40,brownsugar,bowl);
            System.out.println(grassJelly);

        }
        else {
            System.out.println("\nWrong option!! Try again!!");
        }

    }

    public static String selectFlavor(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPress 1 for Chocolate"+
                "\nPress 2 for Vanilla" +
                "\nPress 3 for Strawberry" +
                "\nPress 4 for Lemon" +
                "\nPress 5 for Red Velvet");

        do {

            System.out.print("Enter a flavor number: ");
            String flavor = scanner.next();
            if (flavor.equalsIgnoreCase("1")){
                return "Chocolate";
            }
            if (flavor.equalsIgnoreCase("2")){
                return "Vanilla";
            }
            if (flavor.equalsIgnoreCase("3")){
                return "Strawberry";
            }
            if (flavor.equalsIgnoreCase("4")){
                return "Lemon";
            }
            if (flavor.equalsIgnoreCase("5")){
                return "Red Velvet";
            }
        }while (true);
    }
}