//hierarchical inheritance
class Employee2 {
    String name;

    void display() {
        System.out.println(name);
    }
}

class Manager2 extends Employee2 {
    String department;

    void manage() {
        System.out.println(department + " is being managed");
    }
}

class Programmer extends Employee2 {
    String language;

    void code() {
        System.out.println("Language: " + language);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        // creats object of the subclasses
        Manager2 m = new Manager2();
        Programmer p = new Programmer();

        // accessing element from parent class
        m.name = "Rishi";
        p.name = "Akash";

        m.department = "Development";
        p.language = "Java";

        System.out.print("Manager: ");
        m.display();
        m.manage();

        System.out.print("Programmer: ");
        p.display();
        p.code();
    }
}