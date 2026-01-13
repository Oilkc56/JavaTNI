import java.util.Scanner;

public class ProductMain4 {
    public static void main(String[] args) {
        product products[] = new product[4];
        String Line = "-----------------------------------------";
        setting_product(products);
        System.out.println("Welcome to MINI SHOP!!\n"+
                Line);
        int i = 1;
        for(product t : products){

            System.out.println("Press "+i+" buy "+t.name+" (items="+t.quantity+")");
            i++;
        }
        System.out.println(Line);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int item = sc.nextInt();
        while(item < 1 || item > 4){
            System.out.print("Invalid!! Enter a number, again: ");
            item = sc.nextInt();

        }
        System.out.println(Line);




        if(item == 1){

            System.out.print("How many Pens do you want to buy? ");
            products[0].sell(sc.nextInt());
            System.out.print("\n\n");
            products[0].showInfo();
        }
        if(item == 2){

            System.out.print("How many Pencils do you want to buy? ");
            products[1].sell(sc.nextInt());
            System.out.print("\n\n");
            products[1].showInfo();
        }
        if(item == 3){

            System.out.print("How many Markers do you want to buy? ");
            products[2].sell(sc.nextInt());
            System.out.print("\n\n");;
            products[2].showInfo();
        }
        if(item == 4){


            System.out.print("How many Highlighters do you want to buy? ");
            products[3].sell(sc.nextInt());
            System.out.print("\n\n");
            products[3].showInfo();
        }



    }


    public static void setting_product(product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};
        for (int i=0; i<products.length; i++) {
            products[i] = new product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
}