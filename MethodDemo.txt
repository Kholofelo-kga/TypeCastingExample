public class MethodDemo {
    // A simple method with no parameters and no return value
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    // A method with parameters and a return value
    public int add(int a, int b) {
        return a + b;
    }
    
    // A method with a parameter but no return value
    public void printMessage(String message) {
        System.out.println(message);
    }
    
    // A method with multiple parameters and a return value
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        
        // Calling the methods
        demo.sayHello();
        
        int sum = demo.add(5, 7);
        System.out.println("Sum: " + sum);
        
        demo.printMessage("This is a custom message.");
        
        double area = demo.calculateCircleArea(3.5);
        System.out.println("Circle Area: " + area);
    }
}
