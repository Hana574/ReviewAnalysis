import java.util.ArrayList;

public class ReviewAnalysis
{
/** All user reviews to be included in this analysis */
private Review[] allReviews;
/** Initializes allReviews to contain all the Review objects to be analyzed */
public ReviewAnalysis(Review[] r)
{
    allReviews = r;
}

/** Returns a double representing the average rating of all the Review objects to be
* analyzed, as described in part (a)
* Precondition: allReviews contains at least one Review.
* No element of allReviews is null.
*/
public double getAverageRating()
{ 
    double sum = 0;
    for (Review r : allReviews){
        sum += r.getRating();
    }
    return sum/allReviews.length;
}

/** Returns an ArrayList of String objects containing formatted versions of
* selected user comments, as described in part (b)
* Precondition: allReviews contains at least one Review.
* No element of allReviews is null.
* Postcondition: allReviews is unchanged.
*/
public ArrayList<String> collectComments()
{
    ArrayList<String> comments = new ArrayList<String>();
    for (int i = 0; i < allReviews.length; i++){
        String c = allReviews[i].getComment();
        boolean a = false;
        boolean b = false;
        for (int j = 0; j < c.length(); j++){
            if (c.substring(j, j + 1).equals("!")) a = true;
        }
        if (c.length() > 0 && (c.substring(c.length() - 1, c.length()).equals(".") || c.substring(c.length() - 1, c.length()).equals("!"))) b = true;
        if (a && b) comments.add(i + "-" + c);
        if (a && !b) comments.add(i + "-" + c + ".");
    }
    return comments;
}
}