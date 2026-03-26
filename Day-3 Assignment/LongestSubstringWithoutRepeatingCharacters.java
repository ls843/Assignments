import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int result = longestSubstring(s);

        System.out.println(result);
    }

    public static int longestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;

        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while(seen.contains(ch)) {
                seen.remove(ch);
                left++;
            }

            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
