package Day5;


class BankAccount {
    final int BankAcNo;
    BankAccount(int accNo) {
        BankAcNo = accNo;
    }

    void display() {
        System.out.println("Account Number: " + BankAcNo);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(12345);
        obj.display();
    }
}