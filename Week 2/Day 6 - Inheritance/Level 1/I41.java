interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef " + name + " is preparing meals.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food to customers.");
    }
}

public class I41 {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.displayInfo();
        chef.performDuties();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
