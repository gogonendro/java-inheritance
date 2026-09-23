//hierarchical inheritance
class Employee {
    String name;

    void display() {
        System.out.println(name);
    }
}

class Manager extends Employee {
    String department;

    void manage() {
        System.out.println(department + " is being managed");
    }
}

class Programmer extends Employee {
    String language;

    void code() {
        System.out.println("Language: " + language);
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

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