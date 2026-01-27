public class Book {
    private String title;
    private String category;
    private double price;
    private int discount_percent;
    private Author author;

    public Book(String tile, String category, double price, Author author){
        this.title = tile;
        this.category = category;
        this.price = price;
        this.author = author;

        //constructor must mention " ALL " attribute
        this.discount_percent = 0;
    }

    public Book(){
        this("","",0.0,null);
    }

    public Author getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDiscount_percent(int percent){
        this.discount_percent = percent;
    }

    public int getDiscount_percent(){
        return this.discount_percent;
    }

    public boolean isDiscountAvailable(){
        return this.price>500;
    }

    public double calculateDiscountPrice(){
        return this.price - (this.price * this.discount_percent/100.0);
    }

    public String showBookInfo(){
        return  "Title: " + this.title +
                "\nCategory: " + this.category +
                "\nPrice: " + this.price + (isDiscountAvailable() ? " (" + calculateDiscountPrice() + ")" : "") +
                "\nAuthor: " + this.author.showAuthorInfo();
    }

}
