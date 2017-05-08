package section4_oop_part2.encapsulation;

/**
 * Created by ihorchyzh on 5/8/17.
 */
public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.playerName = "Ihor";
        player.playerHealth = 100;
        player.playerWeapon = "Sword";

        int damage = 70;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
