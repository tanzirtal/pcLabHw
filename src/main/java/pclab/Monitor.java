package pclab;

public class Monitor {

    Resolution resolution;
    String modelNumber;
    String manufacturerName;

    public Monitor(Resolution resolution, String modelNumber, String manufacturerName) {
        this.resolution = resolution;
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }

}
