public class ClassObjectDemo {
    public static void main(String[] args) {
		
        Person person = new Person("Kholofelo", 30);
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
