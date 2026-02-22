package Banking;

import java.io.*;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable{

    public AccountTransaction(String accId){
        super(accId);
    }
    public boolean hasAccountId() throws FileNotFoundException {
        File file = new File(getFilename());
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            String[] data = scanner.nextLine().split(",");
            String id = data[0];
            if (id.equals(getAccId())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deposit(double amount) throws IOException {
        setAccBalance(getAccBalance() + amount);
    }

    public void withdraw(double amount){
        if (getAccBalance() >= amount){
            setAccBalance(getAccBalance()-amount);
        }
    }

    public double checkBalance(){
        return getAccBalance();
    }

}