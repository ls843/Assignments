public class StringCompression {
    public static void main(String[] args) {
        String s = "aabcccccaaa";

        String result = compress(s);

        System.out.println(result);
    }

    public static String compress(String s) {
        if(s == null || s.length() == 0) return "";
        int n = s.length();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(n - 1));
        sb.append(count);

        String compressed = sb.toString();
        return compressed.length() < n ? compressed : s;
    }
}
