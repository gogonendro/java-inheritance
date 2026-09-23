package Basic;

//demonstration of multilevel inheritance
class Animal {
    String name;

    void eat() {
        System.out.println(name + " eats");
    }
}

class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println(name + " has " + legs + " legs");
    }
}

class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println(name + " is a " + breed + " dog");
    }

    public static void main(String[] args) {
        Dog ob = new Dog();

        // Animal --> Mammal --> Dog
        ob.name = "Poltu";
        ob.legs = 4;
        ob.breed = "Native Indian";

        ob.eat();
        ob.walk();
        ob.bark();
    }
}