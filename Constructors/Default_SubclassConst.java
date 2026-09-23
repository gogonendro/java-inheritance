package Constructors;

//default constructor in subclass
class Appliance {
    Appliance() {
        System.out.println("Appliance constructor called");
    }
}

class WashingMachine extends Appliance {
    // no constructor present in washing machine
    // java automatically does the work of a constructor which calls super()
    void display() {
        System.out.println("Washing Machine is ready");
    }
}

public class Default_SubclassConst {
    public static void main(String[] args) {
        WashingMachine ob = new WashingMachine();
        ob.display();
    }
}