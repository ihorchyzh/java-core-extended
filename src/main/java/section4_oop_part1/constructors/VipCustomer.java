package section4_oop_part1.constructors;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    // 1st constructor empty should call the constructor with 3 parameters with default values
    public VipCustomer() {
        this("default name", 0, "default email");
    }

    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default email");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    // 3rd constructor should save all fields.
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // create getters only for this using code generation of intellij as setters wont be needed
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
