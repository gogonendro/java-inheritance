package Polymorphism;

//Method Overloading: Compile-Time Polymorphism
public class MethodOverloading {
    int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    int sum(int a, int b, int c) {
        int s = a + b + c;
        return s;
    }

    double sum(double a, double b) {
        double s = a + b;
        return s;
    }

    public static void main(String[] args) {
        MethodOverloading ob = new MethodOverloading();

        // Java decides which 'sum' to call based on the passed arguments
        System.out.println(ob.sum(2, 3));
        System.out.println(ob.sum(4, 8, 9));
        System.out.println(ob.sum(6.9, 6.7));
    }
}
