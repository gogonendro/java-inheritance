
//using 'super' as method
class Printer {
    void print() {
        System.out.println("Printing a document");
    }
}

class ColourPrinter extends Printer {
    void print() {
        System.out.println("Printing a colour document");
        // super targets the immediate superclass' method of the present subclass
        super.print();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        ColourPrinter ob = new ColourPrinter();
        ob.print();
    }
}
