public class AnagramChecker {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = anagramCheck(s1, s2);
        System.out.println(result);
    }

    public static boolean anagramCheck(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        int freq[] = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}