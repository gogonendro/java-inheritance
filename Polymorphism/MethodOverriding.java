package Polymorphism;

//Run-Time Polymorphism
class superclass {
    void display() {
        System.out.println("This is superclass");
    }
}

class subclass extends superclass {
    void display() {
        System.out.println("This is subclass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        superclass ob = new subclass(); // reference type -> superclass; actual object -> subclass
        ob.display(); // display() of subclass overrides the display() of superclass
    }
}
