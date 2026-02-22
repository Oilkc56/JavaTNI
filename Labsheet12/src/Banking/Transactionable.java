package Banking;

import java.io.IOException;

public interface Transactionable {

    public void deposit(double amount) throws IOException;
    public void withdraw(double amount);
    public double checkBalance();

}