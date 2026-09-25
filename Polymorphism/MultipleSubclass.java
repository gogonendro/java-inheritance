package Polymorphism;

//Method Overriding demonstrating Run-Time Polymorphism with multiple subclasses
class Instrument {
    void sound() {
        System.out.println("Instrument makes sound");
    }
}

class Harmonium extends Instrument {
    void sound() {
        System.out.println("Harmonium makes sound");
    }
}

class Tabla extends Instrument {
    void sound() {
        System.out.println("Tabla makes sound");
    }
}

public class MultipleSubclass {
    public static void main(String[] args) {
        // calling overriden methods with reference to the common superclass
        Instrument h = new Harmonium();
        Instrument t = new Tabla();

        h.sound(); // sound of harmonium
        t.sound(); // sound of tabla
    }
}
