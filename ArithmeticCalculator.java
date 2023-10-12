public class ArithmeticCalculator {
    // Instance variables to store operands
    private double operand1;
    private double operand2;

    // Constructor
    public ArithmeticCalculator(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    // Method for addition
    public double add() {
        return operand1 + operand2;
    }

    // Method for subtraction
    public double subtract() {
        return operand1 - operand2;
    }

    // Method for multiplication
    public double multiply() {
        return operand1 * operand2;
    }

    // Method for division
    public double divide() {
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }
}


public class Main {
    public static void main(String[] args) {
        // Input operands
        double num1 = 10;
        double num2 = 5;

        // Create an instance of ArithmeticCalculator
        ArithmeticCalculator calculator = new ArithmeticCalculator(num1, num2);

        // Perform operations
        double additionResult = calculator.add();
        double subtractionResult = calculator.subtract();
        double multiplicationResult = calculator.multiply();
        double divisionResult = calculator.divide();

        // Display results
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
