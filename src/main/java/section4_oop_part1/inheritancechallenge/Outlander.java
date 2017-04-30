package section4_oop_part1.inheritancechallenge;

/**
 * Created by ihorchyzh on 4/30/17.
 */
public class Outlander extends Car {

    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        } else if (newVelocity > 50 && newVelocity <= 100) {
            changeGear(6);
        } else {
            System.out.println("Rocket!");
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
