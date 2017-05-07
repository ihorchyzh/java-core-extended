package section4_oop_part2.composition;

/**
 * Created by ihorchyzh on 5/4/17.
 */
public class MotherBoard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
