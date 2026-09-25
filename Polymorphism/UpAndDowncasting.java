package Polymorphism;

//demonstration of upcasting and downcasting
class Matter {
    void details() {
        System.out.println("I am matter");
    }
}

class Solid extends Matter {
    void details() {
        System.out.println("I am solid");
    }

    void fixedShape() {
        System.out.println("Solid has fixed shape");
    }
}

public class UpAndDowncasting {
    public static void main(String[] args) {

        /*
         * looking at solid through the reference of matter, so it cannot access the
         * method exclusive to solid
         */
        Matter m = new Solid(); // upcasting
        m.details();

        /*
         * telling java that the matter m is actually a solid, hence '(solid)m'
         * therefore it can access methods specific to solid
         */
        Solid s = (Solid) m; // downcasting
        s.fixedShape();
    }
}
