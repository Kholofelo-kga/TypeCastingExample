public class StringOperations {
    public static void main(String[] args) {
        // Create a regular string
        String regularString = "This is a regular string.";

        // Create a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is a StringBuffer.");

        // Create a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("This is a StringBuilder.");

        // Append text to StringBuffer and StringBuilder
        stringBuffer.append(" Appended text to StringBuffer.");
        stringBuilder.append(" Appended text to StringBuilder.");

        // Display the strings
        System.out.println("Regular String: " + regularString);
        System.out.println("StringBuffer: " + stringBuffer.toString());
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        StringOperations.main(args);
    }
}
