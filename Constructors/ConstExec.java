package Constructors;

// Constructor Execution Order: by using constructors in each class, we don't need to explicitly use 'super' to create a calling chain, it does it automatically
class Device {
    Device() {
        System.out.println("Device constructor");
    }
}

class Computer extends Device {
    Computer() {
        System.out.println("Computer constructor");
    }
}

class Laptop extends Computer {
    Laptop() {
        System.out.println("Laptop constructor");
    }
}

public class ConstExec {
    public static void main(String[] args) {
        new Laptop();
    }
}