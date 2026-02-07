public class CupCake extends Bakery {

    private int piece;

    public CupCake(int piece, String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.piece = piece;
    }

    public boolean isPackingBox(){
        return piece >= 6;
    }

    public int getBoxNumber(){
        if (isPackingBox()){
            return this.piece / 6;
        }
        else {
            return 0;
        }
    }

    public int getBagNumber(){
        return this.piece % 6;
    }

    @Override
    public int getPackingCost() {
        if (isPackingBox())
            return getBoxNumber() * super.getPackingCost();
        return 0;
    }

    public double calculateTotalPrice() {
        return (getUnitPrice() * this.piece) + getPackingCost() + (getBagNumber() * 0.5);
    }

    public String toString(){
        return super.toString() +
                "\nCup Cake (" + getFlavor() + ") with " +
                (isPackingBox()?getBoxNumber()+" Box ": " ") + getBagNumber() + " Bag" +
                "\nTotal price of Cup Cake = " + calculateTotalPrice();
    }




}