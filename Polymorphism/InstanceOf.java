package Polymorphism;

class Painting {
    void display() {
        System.out.println("I am painting");
    }
}

class Watercolor extends Painting {
    void display() {
        System.out.println("I am watercolor");
    }

    void water() {
        System.out.println("I use water medium");
    }
}

class OilPainting extends Painting {
    void display() {
        System.out.println("I am oil painting");
    }

    void oil() {
        System.out.println("I use oil medium");
    }
}

public class InstanceOf {
    public static void main(String[] args) {
        Painting p;
        p = new Painting(); // p object is a painting

        // checks if painting is watercolor
        if (p instanceof Watercolor) {
            // this will return false, and will not downcast
            Watercolor w = (Watercolor) p;
            w.water();
        }

        p = new OilPainting(); // p is oil painting object

        // checks if painting is oil painting
        if (p instanceof OilPainting) {
            // if true, downcast
            OilPainting o = (OilPainting) p;
            o.oil(); // call the method specifically in oil painting
        }
    }
}
