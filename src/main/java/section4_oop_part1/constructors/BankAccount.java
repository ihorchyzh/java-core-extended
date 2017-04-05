package section4_oop_part1.constructors;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class BankAccount {

    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

//    public BankAccount() {
//        System.out.println("Empty constructor was called");
//    }

    public BankAccount() {
//      call constructor with params in default constructor
        this(0, 0, "blank Name", "blank email", "blank phone");
        System.out.println("Default constructor was called");
    }

    public BankAccount(String customerName, String email, String phone) {
        this(999, 9999, customerName, email, phone);
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(int number, double balance, String customerName, String email, String phone) {
        System.out.println("Constructor with fields was called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }


    public void deposit(double depositAmount) {
        System.out.println("Deposit summ is " + depositAmount);
        System.out.println("Old balance was " + this.balance);
        this.balance += depositAmount;
        System.out.println("New balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        System.out.println("Withdraw summ is " + withdrawalAmount);
        if (this.balance >= withdrawalAmount) {
            System.out.println("Old balance was " + this.balance);
            this.balance -= withdrawalAmount;
            System.out.println("New balance is " + this.balance);
        } else {
            System.out.println("Insufficient funds. Try withdraw the summ that is equals or" +
                    " less your balance " + this.balance);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

}
