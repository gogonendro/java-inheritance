class EmployeeRecord {
    private int salary = 60000;

    void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class StaffMember extends EmployeeRecord {
    void display() {
        // System.out.println(salary); <-- invalid statement, because salary is not
        // directly accessible because its declared private
        showSalary(); // <-- valid because it calls the method
    }
}

public class AccessModifier_Pvt {
    public static void main(String[] args) {
        StaffMember ob = new StaffMember();
        ob.display();
    }
}