public class ConstructorExample {
    private String message;

    // Default constructor
    public ConstructorExample() {
        message = "This is a default constructor.";
    }

    // Parameterized constructor
    public ConstructorExample(String customMessage) {
        message = customMessage;
    }

    // Constructor overloading
    public ConstructorExample(int number) {
        message = "This is an overloaded constructor with an integer parameter: " + number;
    }

    // Getter method to access the message
    public String getMessage() {
        return message;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create instances using different constructors
        ConstructorExample defaultConstructorDemo = new ConstructorExample();
        ConstructorExample paramConstructorDemo = new ConstructorExample("Hello, Constructors!");
        ConstructorExample overloadedConstructorDemo = new ConstructorExample(42);

        // Access and display messages
        System.out.println("Default Constructor Message: " + defaultConstructorDemo.getMessage());
        System.out.println("Parameterized Constructor Message: " + paramConstructorDemo.getMessage());
        System.out.println("Overloaded Constructor Message: " + overloadedConstructorDemo.getMessage());
    }
}
