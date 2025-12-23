import java.util.Scanner;

public class Lab602 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count=0;
        int index=0;
        String[] movies = {"Me Before You", "Titanic", "Before Sunrise", "The Holiday", "A Walk to Remember"};
        double[] rate_score = {4.2, 4.9, 4.4, 3.7, 4.3};

        System.out.print("Enter a movie title: ");
        String title = scanner.nextLine();

        for (int i = 0; i <= movies.length-1; i++){
            if (movies[i].equalsIgnoreCase(title)){
                count++;
                break;
            }
            index++;
        }

        String movie = movies[index];

        if (count != 1){
            System.out.print("\nCannot found this movie title...");
        }else {
            System.out.println("\nThe rating score of \"" + movies[index] + "\" is " + rate_score[index]);
            System.out.print("This movie is ranked number " + find_rank(rate_score,movies,index));
        }


    }

    public static int find_rank(double[] rate,String[] movies,int index){
        double rank = rate[index];
        int ranked = 1;
        for (int i = 0; i <= movies.length-1; i++){
            if (rate[i]>rank){
                ranked++;
            }

        }
        return ranked;
    }
}
