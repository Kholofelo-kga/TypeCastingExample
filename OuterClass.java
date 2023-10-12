public class OuterClass {
    private String outerMessage = "This is an outer class message.";

    // Inner class
    public class InnerClass {
        private String innerMessage = "This is an inner class message.";

        public void displayInnerMessage() {
            System.out.println(innerMessage);
        }
    }

    public void displayOuterMessage() {
        System.out.println(outerMessage);
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass outerInstance = new OuterClass();
        OuterClass.InnerClass innerInstance = outerInstance.new InnerClass();

        outerInstance.displayOuterMessage();
        innerInstance.displayInnerMessage();
    }
}
