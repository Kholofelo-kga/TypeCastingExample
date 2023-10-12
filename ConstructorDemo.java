public class ConstructorDemo {
    private String message;

    // Default constructor (no parameters)
    public ConstructorDemo() {
        message = "This is a default constructor.";
    }

    // Parameterized constructor
    public ConstructorDemo(String customMessage) {
        message = customMessage;
    }

    // Constructor overloading
    public ConstructorDemo(int number) {
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
        ConstructorDemo defaultConstructorDemo = new ConstructorDemo();
        ConstructorDemo paramConstructorDemo = new ConstructorDemo("Hello, Constructors!");
        ConstructorDemo overloadedConstructorDemo = new ConstructorDemo(42);

        // Access and display messages
        System.out.println("Default Constructor Message: " + defaultConstructorDemo.getMessage());
        System.out.println("Parameterized Constructor Message: " + paramConstructorDemo.getMessage());
        System.out.println("Overloaded Constructor Message: " + overloadedConstructorDemo.getMessage());
    }
}
