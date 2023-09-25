package pclab;

public class MotherBoard {

    String model;
    String manufacturer;
    int ramSlots;
    int cardSlots;
    String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

public void loadProgram(String programName){
    System.out.println(programName + " is now running...");
}

    @Override
    public String toString() {
        return "MotherBoard{" +
                "Model:'" + model + '\'' +
                ", Manufacturer:'" + manufacturer + '\'' +
                ", Number of ram slots='" + ramSlots + '\'' +
                ", Number of card slots='" + cardSlots + '\'' +
                ", Running bios version: " + bios + '\'' +
                '}';

    }
}
