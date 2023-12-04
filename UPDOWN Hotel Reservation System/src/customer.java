import java.util.HashMap;
public class customer {

    String FullName;
    String IdNumber;


    public  customer(String fullName, String idNumber) {
        this.FullName = fullName;
        this.IdNumber = idNumber;

        HashMap<String, String> RegisterDetails = new HashMap<String, String>();

        RegisterDetails.put(FullName, IdNumber);
        System.out.println(" ");
        System.out.println("Your Registration is successfull");
        System.out.println(" ");
    }

}
