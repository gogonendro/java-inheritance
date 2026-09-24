
//practice program of single inheritance
class Employee {
    String name;
    int salary;

    void display() {
        System.out.println(name + " recieved a salary of Rs. " + salary);
    }
}

class Manager extends Employee {
    String dept;

    void showDept() {
        System.out.println("Department: " + dept);
    }

    public static void main(String[] args) {

        // demonstration of subclass accessing elements from superclass
        Manager ob = new Manager();
        ob.name = "Akash";
        ob.salary = 100000;
        ob.dept = "Computer";
        ob.display();
        ob.showDept();
    }
}