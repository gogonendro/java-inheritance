package Polymorphism;

//to show that one method can handle different types of objects because they share a common superclass
class Employee {
    void showDetails() {
        // method to be overridden
    }
}

class HR extends Employee {
    void showDetails() {
        System.out.println("Rishi");
    }
}

class Developer extends Employee {
    void showDetails() {
        System.out.println("Akash");
    }
}

public class MethodParameters {

    // display() uses the superclass as a parameter which handles every subclass
    /*
     * means display() can receive an 'employee' or any object whose class inherits
     * from 'employee'
     */
    void display(Employee em) {
        em.showDetails(); // em = reference to superclass
    }

    public static void main(String[] args) {

        MethodParameters ob = new MethodParameters();
        // passing subclass through display()
        ob.display(new HR());
        ob.display(new Developer());
    }
}
