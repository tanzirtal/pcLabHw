package pclab;

public class PC {
    private Case aCase;
    private MotherBoard motherboard;
    private Monitor monitor;

    public PC(Case aCase, MotherBoard motherboard, Monitor monitor) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(100,200,"blue");
    }

    public void description(){
        System.out.println("Welcome to Worst Buy, below is the description of the pc on sale today: " + "\n" + aCase.toString() + "\n" + monitor.toString() + "\n" + motherboard.toString());
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Photoshop");
    }

}
