package section4_oop_part2.encapsulation;

/**
 * Created by ihorchyzh on 5/8/17.
 */
public class Player {

    public String playerName;
    public int playerHealth;
    public String playerWeapon;

    public void loseHealth(int damage) {
        this.playerHealth = this.playerHealth - damage;
        if (this.playerHealth <= 0) {
            System.out.println("The player knocked out");
        }
    }

    public int healthRemaining(){
        return this.playerHealth;
    }
}
