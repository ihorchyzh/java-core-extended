package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/4/17.
 */
public class Car extends Vehicle {

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
