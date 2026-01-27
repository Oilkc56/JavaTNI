import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {

        //No,1
        String author_name = JOptionPane.showInputDialog("Enter author's name : ");

        //No,2
        int consent = JOptionPane.showConfirmDialog(null,"Prefer to publish your nationality and birthyear?");

        Author author;

        if (consent == JOptionPane.YES_OPTION){
            //No,2 A
            String nationality = JOptionPane.showInputDialog("Enter author's nationality : ");
            int birthyear =  Integer.parseInt(JOptionPane.showInputDialog("Enter author's birthyear : "));
            author = new Author(author_name, nationality, birthyear);
        }
        else {
            //No,2 B
            author = new Author(author_name);
        }

        JOptionPane.showMessageDialog(null,"Author's info : " + author.showAuthorInfo());

        String title = JOptionPane.showInputDialog("Enter book title : ");
        String category = JOptionPane.showInputDialog("Enter book category : ");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price : "));

        Book book = new Book(title,category,price,author);

        if (book.isDiscountAvailable()){
            book.setDiscount_percent(Integer.parseInt(JOptionPane.showInputDialog("Enter discount (%) : ")));
        }

        JOptionPane.showMessageDialog(null,book.showBookInfo());
    }


}
