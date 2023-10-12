import java.util.Arrays;

public class EmailValidator {
    public static void main(String[] args) {
        
        String[] employeeEmails = {
            "employee1@kol.co.za",
            "employee2@kol.co.za",
            "employee3@kol.co.za",
            "employee4@kol.co.za",
            "employee5@kol.co.za"
        };

     
        String emailToSearch = "employee3@kol.co.za";

        
        if (isValidEmail(emailToSearch, "kol.co.za")) {
            
            if (Arrays.asList(employeeEmails).contains(emailToSearch)) {
                System.out.println("Email ID found: " + emailToSearch);
            } else {
                System.out.println("Email ID not found: " + emailToSearch);
            }
        } else {
            System.out.println("Invalid email format or domain: " + emailToSearch);
        }
    }

    public static boolean isValidEmail(String email, String domain) {
        
        return email.endsWith("@" + domain);
    }
}

public class Main {
    public static void main(String[] args) {
        EmailValidator.main(args);
    }
}
