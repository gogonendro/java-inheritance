package Polymorphism;

//superclass
class Parent {
    void display() {
        System.out.println("Parent");
    }
}

// subclass #1
class Son extends Parent {
    void display() {
        System.out.println("Son");
    }
}

// subclass #2
class Daughter extends Parent {
    void display() {
        System.out.println("Daughter");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        /*
         * the same superclass reference 'ob' can refer to different subclass objects,
         * the overridden method is selected according to the actual object at runtime
         */
        Parent ob;
        ob = new Son();
        ob.display();

        ob = new Daughter();
        ob.display();
    }
}
