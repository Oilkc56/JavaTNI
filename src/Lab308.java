import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        int count =1;
        int max = 0,min = 0,even = 0,odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int loop = scanner.nextInt();
        for (int i = 1; i <= loop; i++) {
            System.out.print("Enter number "+(count++)+": ");
            int num = scanner.nextInt();;
            if (num>max) max = num;
            if (num<min) min = num;
            if (num%2==0) ++even;
            if (num%2!=0) ++odd;
        }
        System.out.println("\nMaximum = "+max);
        System.out.println("Minimum = "+min);
        System.out.println("Even number = "+even);
        System.out.println("Odd  number = "+odd);
    }
}
 