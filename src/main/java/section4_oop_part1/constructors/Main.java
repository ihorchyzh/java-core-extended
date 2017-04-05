package section4_oop_part1.constructors;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class Main {

    public static void main(String[] args) {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

//        BankAccount ihorsBankAccount = new BankAccount();
//
//        System.out.println(ihorsBankAccount.getPhone());
//        System.out.println(ihorsBankAccount.getNumber());
//        System.out.println(ihorsBankAccount.getEmail());
//        System.out.println(ihorsBankAccount.getCustomerName());
//        System.out.println(ihorsBankAccount.getBalance());
//
//        System.out.println();
//
////      Instead this setters we use constructor with params like in chyzhsBankAccount
//        ihorsBankAccount.setCustomerName("Ihor");
//        ihorsBankAccount.setEmail("ihor@gmail.com");
//        ihorsBankAccount.setNumber(333);
//        ihorsBankAccount.setPhone("+380 (93) 33-33-333");
//
//
//        System.out.println("Blank account balance is " + ihorsBankAccount.getBalance());
//        ihorsBankAccount.deposit(1000);
//        ihorsBankAccount.withdraw(999);
//        ihorsBankAccount.withdraw(500);
//
//        System.out.println();
//
//        BankAccount chyzhsBankAccount = new BankAccount(555, 2000, "Chyzh",
//                "email", "+380 (66) 77-77-777");
//        System.out.println(chyzhsBankAccount.getBalance());
//        System.out.println(chyzhsBankAccount.getCustomerName());
//        System.out.println(chyzhsBankAccount.getEmail());
//        System.out.println(chyzhsBankAccount.getNumber());
//        System.out.println(chyzhsBankAccount.getPhone());
//
//        System.out.println();
//
//        BankAccount timBankAccount = new BankAccount("Tim", "timemail", "+380 (55) 55-55-555");
//        System.out.println(timBankAccount.getBalance());
//        System.out.println(timBankAccount.getCustomerName());
//        System.out.println(timBankAccount.getEmail());
//        System.out.println(timBankAccount.getNumber());
//        System.out.println(timBankAccount.getPhone());
//

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipCustomer firstVip = new VipCustomer();
        System.out.println(firstVip.getName());
        System.out.println(firstVip.getCreditLimit());
        System.out.println(firstVip.getEmail());

        System.out.println();

        VipCustomer secondVip = new VipCustomer("secondVip", 2222);
        System.out.println(secondVip.getName());
        System.out.println(secondVip.getCreditLimit());
        System.out.println(secondVip.getEmail());

        System.out.println();

        VipCustomer thirdVip = new VipCustomer("thirdVip", 3333, "thirdVipEmail");
        System.out.println(thirdVip.getName());
        System.out.println(thirdVip.getCreditLimit());
        System.out.println(thirdVip.getEmail());

        System.out.println();

    }

}
