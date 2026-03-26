public class StringToIntegerAtoi {
     public static void main(String[] args) {
        String s = "   -42";

        int result = myAtoi(s);

        System.out.println(result);        
    }

    public static int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;

        s = s.trim();
        if(s.length() == 0) return 0;
        
        long result = 0;
        int i = 0;

        int sign = 1;
        if(s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            if(result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } 
            if(result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) result * sign;
    }
}