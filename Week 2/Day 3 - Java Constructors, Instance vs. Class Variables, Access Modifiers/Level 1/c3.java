class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);

        Person person2 = new Person(person1);

        System.out.println("Person 1 Details:");
        person1.displayPersonDetails();

        System.out.println("Person 2 Details (copied from Person 1):");
        person2.displayPersonDetails();

        person2.name = "Bob";
        person2.age = 25;

        System.out.println("Person 2 Details after modification:");
        person2.displayPersonDetails();

    }
}