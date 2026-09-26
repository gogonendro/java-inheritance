package Polymorphism;

//program implementing all polymorphic segments
class Cinema {
    void display() {
        // method to be overridden
    }
}

// subclass 1
class Hollywood extends Cinema {
    void display() {
        System.out.println("I am Hollywood");
    }

    // method specific to hollywood
    void Country() {
        System.out.println("Hollywood is in USA");
    }
}

// subclass 2
class Bollywood extends Cinema {
    void display() {
        System.out.println("I am Bollywood");
    }

    // method specific to bollywood
    void Country() {
        System.out.println("Bollywood is in India");
    }
}

public class FinalRecap {

    // general method for calling objects of all subclasses
    void show(Cinema c) {
        c.display();
    }

    // method with same name different args for overloading
    void show(String lang) {
        System.out.println("My language is " + lang);
    }

    public static void main(String[] args) {
        FinalRecap ob = new FinalRecap();

        ob.show(new Hollywood()); // dynamic method dispatch
        ob.show("English"); // method overloading

        ob.show(new Bollywood()); // dynamic method dispatch
        ob.show("Hindi"); // method overloading

        Cinema c;// create 'c' as a reference to cinema
        c = new Hollywood(); // upcasting

        if (c instanceof Hollywood) { // usage of instanceof
            Hollywood h = (Hollywood) c; // downcasting
            h.Country(); // calls method specific to hollywood
        }
    }
}
