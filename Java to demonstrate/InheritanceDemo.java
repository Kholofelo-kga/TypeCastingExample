public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.greetParent();
    }
}

class Parent {
    public void greetParent() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public void greetParent() {
        System.out.println("Hello from Child");
    }
}
