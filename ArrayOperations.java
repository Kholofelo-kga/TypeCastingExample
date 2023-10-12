public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // Create an array of strings
        String[] stringArray = {"Apple", "Banana", "Cherry", "Date", "Fig"};

        // Access and display elements from the arrays
        System.out.print("Integer Array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        System.out.print("\nString Array: ");
        for (String fruit : stringArray) {
            System.out.print(fruit + " ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayOperations.main(args);
    }
}
