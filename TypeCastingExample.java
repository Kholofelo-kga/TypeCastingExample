public class TypeCastingExample {
    public static void main(String[] args) {
		
       
        int numInt = 10;
        double numDouble = numInt; 

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer: " + numInt);
        System.out.println("Double: " + numDouble);

        
        double numDouble2 = 15.75;
        int numInt2 = (int) numDouble2;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double: " + numDouble2);
        System.out.println("Integer: " + numInt2);
    }
}
