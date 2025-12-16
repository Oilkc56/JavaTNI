import javax.swing.*;

public class Lab502 {
    public static void main(String[] args) {
        while (true) {

            int check = JOptionPane.showConfirmDialog(null, "Do you want to check your score", "Check score", JOptionPane.YES_NO_OPTION);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!!");
                break;
            } else {

                int midterm = input_score("Enter midterm score:", 45);
                int Final = input_score("Enter Final score:", 55);

                JOptionPane.showMessageDialog(null, "Your score is " + cal_score(midterm, Final) + "\n" + "You get grade " + find_grade(cal_score(midterm, Final)));


            }


        }
    }

    public static String find_grade(int score){
        if (score <= 100 && score >=80 ){
            return "A";
        }
        if (score <= 79 && score >=70 ){
            return "B";
        }
        if (score <= 69 && score >=60 ){
            return "C";
        }
        if (score <= 59 && score >=50 ){
            return "D";
        }
        return "F";


    }

    public static int cal_score(int midterm, int Final){
        return midterm + Final;
    }

    public static int input_score(String message, int limit_score){
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));
        while (score<0 || score > limit_score) {
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and " + limit_score + "\n" + message));
        }
        return score;

    }
}
