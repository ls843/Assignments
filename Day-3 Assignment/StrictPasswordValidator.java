import java.util.regex.Pattern;

public class StrictPasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {
            "Password1@",   
            "pass1@",        
            "PASSWORD1@",  
            "Password@",    
            "Password1"    
        };

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&]).{8,}$";
        Pattern pattern = Pattern.compile(regex);

        for (String pwd : passwords) {
            System.out.println(pwd + " : " + pattern.matcher(pwd).matches());
        }
    }
}