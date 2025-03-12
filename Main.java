import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Review r1 = new Review(4, "Good! Thx.");
        Review r2 = new Review(3, "OK site");
        Review r3 = new Review(5, "Great!");
        Review r4 = new Review(2, "Poor! Bad.");
        Review r5 = new Review(3, "");

        Review[] r = {r1, r2, r3, r4, r5};
        ReviewAnalysis x = new ReviewAnalysis(r);
        System.out.println(x.getAverageRating());

        ArrayList<String> c = x.collectComments();
        System.out.println(c);
    }
}