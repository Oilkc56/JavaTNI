import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        product product1 = new product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;
        product product2 = new product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;
        String Line = "-----------------------------------------";
        System.out.println("Welcome to Mini Shop\n"+
                Line+
                "\nPress [1] to buy Pen"
                +"\nPress [2] to buy Notebook");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int item = sc.nextInt();
        while (item < 1 || item > 2) {
            System.out.print("Invalid number! Enter a number, again: ");
            item = sc.nextInt();

        }


        System.out.print("\n\n");
        if(item == 1){

            product1.showInfo();
            System.out.print(Line+"\nHow many Pens do you want to buy? ");
            product1.sell(sc.nextInt());
            System.out.println(Line);
            product1.showInfo();
        }
        if(item == 2){
            product2.showInfo();
            System.out.print(Line+"\nHow many Notebooks do you want to buy? ");
            product2.sell(sc.nextInt());
            System.out.println(Line);
            product2.showInfo();
        }
    }
}