package Customer;

public class Regular extends Customer {

    public Regular(String name,double billAmount){
        super(name,billAmount);
    }

    public boolean isDiscount(){
        return getBillAmount() >= 500;
    }

    @Override
    public double calculateFinalBill() {
        if(isDiscount())
            return getBillAmount() - (getBillAmount() * 0.05);
        return getBillAmount();
    }

    public String toString() {
        return super.toString()+
                (isDiscount() ? "\nYou get discount 5%" : "") +
                "\nTotal price = " + calculateFinalBill();
    }

}
