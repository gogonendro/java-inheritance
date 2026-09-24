
//Method overriding
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Override {
    public static void main(String[] args) {
        Circle ob = new Circle();
        ob.draw(); // this overrides the method in parent class
    }
}