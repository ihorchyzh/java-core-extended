package section4_oop_part1.classes;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Porsche Carrera");
        holden.setModel("Holden Captiva");

        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());

    }

}
