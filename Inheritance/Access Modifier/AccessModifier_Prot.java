class VehicleData {
    protected String model = "Honda City";
}

class CarData extends VehicleData {
    void display() {
        System.out.println(model); // protected data members can be accessed in a subclass
    }
}

public class AccessModifier_Prot {
    public static void main(String[] args) {
        CarData ob = new CarData();
        ob.display();
    }
}