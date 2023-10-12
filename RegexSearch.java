import java.util.regex.*;

public class RegexSearch {
    public static void main(String[] args) {
        // Array of sample strings
        String[] strings = {
            "apple123",
            "banana456",
            "cherry789",
            "date101",
            "fig567"
        };

        // Regular expression pattern to search for strings containing numbers
        String regexPattern = ".*\\d+.*";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regexPattern);

        // Search for matching strings
        for (String str : strings) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("Matched: " + str);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        RegexSearch.main(args);
    }
}
