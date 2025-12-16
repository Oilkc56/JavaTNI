import java.util.Scanner;

public class Ex501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (is_even(number)){
            System.out.println(number + " is Even and " + check_type_num(number));
        } else {
            System.out.println(number + " is Odd and " + check_type_num(number));
        }


    }

    public static boolean is_even(int number){
        return number % 2 == 0;

    }

    public static String check_type_num(int number){
        if (number > 0){
            return "positive num";
        } else if (number < 0) {
            return "nev num";
        }
        return "zero";
    }



}
