package section4_oop_part1.classes;

/**
 * Created by ihorchyzh on 4/5/17.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.contains("porsche") || validModel.contains("holden")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

}
