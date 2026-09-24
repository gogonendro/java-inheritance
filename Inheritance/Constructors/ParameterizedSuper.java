
//using parameterized super
class Book {
    String title;

    Book(String t) {
        title = t;
    }
}

class TextBook extends Book {
    String subject;

    TextBook(String t, String s) {
        super(t); // parameter is passed through super
        subject = s;
    }

    void display() {
        System.out.println("Book: " + title);
        System.out.println("Subject: " + subject);
    }
}

public class ParameterizedSuper {
    public static void main(String[] args) {
        TextBook ob = new TextBook("Mahabharata", "Mythology");
        ob.display();
    }
}