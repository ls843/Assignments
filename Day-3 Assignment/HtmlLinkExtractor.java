import java.util.regex.*;

public class HtmlLinkExtractor {
    public static void main(String[] args) {
        String html = """
            <html>
                <a href="https://example.com">Example</a>
                <a class="link" href="https://google.com">Google</a>
                <a href="https://openai.com">OpenAI</a>
            </html>
        """;

        String regex = "<a\\s+[^>]*href=\"([^\"]*)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}