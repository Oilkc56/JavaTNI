package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numEs = 0;
        int numFr = 0;
        double totalPrice = 0;
        while (true){
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = scanner.nextByte();

            if (option == 1) {
                Espresso espresso = orderEspresso();
                numEs++;
                totalPrice += espresso.calculateFinalPrice();

            } else if (option == 2){

                Frappuccino frappuccino = orderFrappuccino();
                numFr++;
                totalPrice += frappuccino.calculateFinalPrice();
            }

            System.out.print("\nDo you want to order more [y/Y]? ");
            String more = scanner.next();
            if (!more.equalsIgnoreCase("y")){
                System.out.println(" ");
                break;
            }

        }


        System.out.println("You ordered " + numEs + " Espresso");
        System.out.println("You ordered " + numFr + " Frappuccino");
        System.out.println("Total price = " + totalPrice);



    }




    public static Espresso orderEspresso(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = scanner.next();

        Espresso espresso = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String is_addShot = scanner.next();
        if (is_addShot.equalsIgnoreCase("Y")){
            System.out.print("How many shots  for adding in Espresso: ");
            int num_Shot = scanner.nextByte();
            espresso.addShot(num_Shot);

        }
        System.out.println("Your order: Espresso (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + espresso.calculateFinalPrice() + " Baht");

        return espresso;

    }

    public static Frappuccino orderFrappuccino(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a size: ");
        String size = scanner.next();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String whipped = scanner.next();
        boolean is_Whipped = whipped.equalsIgnoreCase("y") ? true:false;

        Frappuccino frappuccino = new Frappuccino(size,is_Whipped);

        System.out.println("Your order: Frappuccino (Size: " + size.toUpperCase() + ")");
        System.out.println("Total Price = " + frappuccino.calculateFinalPrice() + " Baht");

        return frappuccino;
    }

}
