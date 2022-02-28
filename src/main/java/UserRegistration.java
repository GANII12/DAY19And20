import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public static void main(String[] args) {
        //UC1 FirstName
        System.out.println("-----------UC1-----------");

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher("Ganesh");
        System.out.println(matcher.find());

        //UC2 LastName
        System.out.println("------------UC2-----------");

        Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher1 = lastName.matcher("Moturu");
        System.out.println(matcher1.find());

        //UC3 Email
        System.out.println("-----------UC3------------");

        Pattern email = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z])+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4})?$");
        Matcher matcher2 = email.matcher("abc.xyz@bl.co.in");
        System.out.println(matcher2.find());

        //UC4 MobileFormat
        System.out.println("-----------UC3------------");
        Pattern mobile = Pattern.compile("^(\\+91|0|91)?[9876][0-9]{9}$");
        Matcher matcher3 = mobile.matcher("09949975752");
        System.out.println(matcher3.find());


    }

}
