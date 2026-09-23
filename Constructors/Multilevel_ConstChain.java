package Constructors;

//multilevel chain of constructor
class University {
    String uniName;

    University(String u) {
        uniName = u;
    }
}

class College extends University {
    String colName;

    College(String u, String c) {
        super(u);
        colName = c;
    }
}

class Student extends College {
    String stuName;
    int roll;

    Student(String u, String c, String st, int r) {
        super(u, c);
        stuName = st;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + stuName);
        System.out.println("Roll: " + roll);
        System.out.println("College name: " + colName);
        System.out.println("University name: " + uniName);
    }
}

// student --> college --> university
class Multilevel_ConstChain {
    public static void main(String[] args) {
        Student ob = new Student("Calcutta University", "IIT", "Akash", 5);
        ob.display();
    }
}