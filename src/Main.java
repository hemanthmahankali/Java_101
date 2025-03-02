import javax.xml.transform.Source;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        String name;
        //string is always in double quotes
        name = "hemanth";
        int numberOfReviews = 1;
        double rating = 1.5;
        Boolean loggedOn = true;
        System.out.println(name + numberOfReviews +rating +loggedOn);

        System.out.println("Hemanth Programming".toUpperCase());
        System.out.println("Hemanth Programming".toLowerCase());
        System.out.println("Hemanth Programming".length());
        System.out.println("Hemanth Programming".toLowerCase().contains("HEMANTH"));
        //concatination
        String firtName = "Hemanth";
        String lastName = "Mahankali";
        System.out.println(firtName.concat(lastName));
        String username = "";
        System.out.println(username.isEmpty());
        String peachez = "Follow me on Instagram";

        String newValuepeachez = "Follow me on Instagram !";
        newValuepeachez = peachez;

        System.out.println(peachez.toUpperCase());

        String hi = "Hello-World";
        System.out.println(hi.charAt(2));

        //indepth integers

        Integer numberOfLikes = 10;
        System.out.println(numberOfLikes.doubleValue());

        String numberOfComments = "10";
        Integer numberOf = Integer.parseInt(numberOfComments);
        System.out.println(numberOf);


        //Integer Operators

        Integer homeWork = 4;
        double mydouble = homeWork.doubleValue();
        System.out.println(mydouble);

        //Difference Between int and Integer ???










    }
}