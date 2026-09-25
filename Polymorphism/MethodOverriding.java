package Polymorphism;

//Run-Time Polymorphism
class Country {
    void display() {
        System.out.println("This is a country");
    }
}

class State extends Country {
    void display() {
        System.out.println("This is a state");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Country ob = new State(); // reference type -> superclass; actual object -> subclass
        ob.display(); // display() of subclass overrides the display() of superclass
    }
}
