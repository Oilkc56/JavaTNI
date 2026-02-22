package Banking;

import java.io.*;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount{

    public OpenNewAccount(String accId, double accBalance){
        super(accId,accBalance);
    }
    public String recordAccount() throws IOException {
        FileWriter file = new FileWriter(getFilename(),true);
        PrintWriter writer = new PrintWriter(file);
        if (isExistingAccount(getAccId())){
            file.close();
            return "This account has been created!!";
        }else {
            writer.println(getAccId()+","+getAccBalance());
            writer.close();
            file.close();
            return "Created account success!!";
        }
    }
    private boolean isExistingAccount(String account_name) throws FileNotFoundException {
        File file = new File(getFilename());
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            String accountID = data[0];
            if (accountID.equals(getAccId())){
                return true;
            }
        }
        return false;

    }

}