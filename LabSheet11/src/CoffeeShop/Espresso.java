package CoffeeShop;

public class Espresso extends Drink{

    private int shot = 0;

    public Espresso(String size){
        super("Espresso",35,size);
    }

    public void addShot(int shot){
        this.shot = shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizeExtra();
    }

    @Override
    public String toString() {
        return super.toString() + (shot == 0 ? "" : "\nAdded " + shot + " shot") + "\nTotal price = " + calculateFinalPrice() + "Baht";
    }
}
