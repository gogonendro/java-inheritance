//overriding using multiple classes
class Vehicle2 {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car2 extends Vehicle2 {
    void move() {
        System.out.println("Car moves");
    }
}

class Boat extends Vehicle2 {
    void move() {
        System.out.println("Boat moves");
    }
}

class M_Override {
    public static void main(String[] args) {
        Car2 c = new Car2();
        Boat b = new Boat();

        // multiple classes accessing same method from same parent class
        c.move();
        b.move();
    }
}