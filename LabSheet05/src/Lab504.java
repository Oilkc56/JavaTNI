import java.util.Scanner;

public class Lab504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Create password: ");
        String password = scanner.next();
        while (check_password(password)){
            System.out.print("Invalid Password! Create password: ");
            password = scanner.next();
        }

        System.out.print("\nEnter confirm password: ");
        String confirm_password = scanner.next();
        while (check_password(password,confirm_password)) {
            System.out.print("Password do not match! Enter confirm password: ");
            confirm_password = scanner.next();
        }

        System.out.println("\nPassword set successfully!!");



    }

    public static boolean check_password(String password){
        return (password.length()>8)? false:true;
    }

    public static boolean check_password(String password, String confirm_password){
        return password.equals(confirm_password)? false:true;
    }
}
