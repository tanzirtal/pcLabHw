package pclab;

public class Case {

    String model;
    String manufacturer;
    String powerSupply;
    Dimension dimension;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return "Case{" +
                "Model:'" + model + '\'' +
                ", Manufacturer:'" + manufacturer + '\'' +
                ", Power Supply:'" + powerSupply + '\'' +
                ", Dimensions='" + dimension + '\'' +
                '}';
    }


}
