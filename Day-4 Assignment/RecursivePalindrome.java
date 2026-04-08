public class RecursivePalindrome {
    public static boolean isPalindrome(String s, int left, int right) {
        if(left >= right) {
            return true;
        }

        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindrome(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "hello";

        System.out.println(word1 + " is palindrome? " + isPalindrome(word1, 0, word1.length() - 1));

        System.out.println(word2 + " is palindrome? " + isPalindrome(word2, 0, word2.length() - 1));
    }
}
