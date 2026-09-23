//implement 'super' keyword as constructor
class Product {
    Product() {
        System.out.println("Product constructor called");
    }
}

class ElectronicProduct extends Product {
    ElectronicProduct() {
        super(); // super() calls the immediate superclass of this subclass
        System.out.println("Electronic Product constructor called");
    }
}

public class SuperConst {
    public static void main(String[] args) {
        ElectronicProduct ob = new ElectronicProduct();
    }
}
