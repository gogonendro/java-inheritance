
//my first inheritance program

//super-class
class Vehicle {
    String brand;

    void start() {
        System.out.println(brand + " has started");
    }
}

// sub-class
class Car extends Vehicle {
    void drive() {
        System.out.println(brand + " is being driven");
    }

    public static void main(String[] args) {
        Car ob = new Car();
        ob.brand = "Audi";
        ob.start(); // sub-class can access the methods in super-class
        ob.drive();
    }
}
