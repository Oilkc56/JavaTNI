public class GrassJelly extends Bakery{

    private String brownsugar;
    private int bowl;

    public GrassJelly(String flavor, double unitPrice, String brownsugar, int bowl){
        super(flavor,unitPrice);
        this.brownsugar = brownsugar;
        this.bowl = bowl;
    }

    public int getBowl(){
        return this.bowl;
    }

    public double topping(){
        if (brownsugar.equals("yes")){
            return 20.0;
        }
        return 0.0;
    }

    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice() + topping())* this.bowl;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nGrassJelly (" + getFlavor() + ") " + (topping()==20.0?"with brownsugar on top ":" ") +
                "\n" + getBowl() + "\nTotal price of GrassJelly = " + calculateTotalPrice();
    }







}