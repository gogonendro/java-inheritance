//implementing the 'super' keyword
class BankAccount {
    int balance = 50000;
}

class SavingsAccount extends BankAccount {
    int balance = 75000;

    void display() {
        // super targets the immediate superclass' data of the present subclass
        System.out.println("Balance in Bank: " + super.balance);
        System.out.println("Balance in Savings: " + balance);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        SavingsAccount ob = new SavingsAccount();

        ob.display();
    }
}
