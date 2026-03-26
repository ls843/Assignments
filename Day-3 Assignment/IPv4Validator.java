import java.util.regex.Pattern;

public class IPv4Validator {
    public static void main(String[] args) {
        String[] tests = {
            "192.168.1.1",     
            "256.0.0.1",       
            "192.168.01.1",    
            "0.0.0.0",         
            "255.255.255.255",
            "1.1.1",           
            "1.1.1.1.1"        
        };

        String regex = "^([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                     + "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                     + "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\."
                     + "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

        Pattern pattern = Pattern.compile(regex);

        for (String ip : tests) {
            System.out.println(ip + " : " + pattern.matcher(ip).matches());
        }
    }
}