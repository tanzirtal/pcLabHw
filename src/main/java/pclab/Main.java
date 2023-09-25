package pclab;

public class Main {

    public static void main(String[] args) {
        Dimension myDimension = new Dimension(100, 200, 50);
        MotherBoard myMotherboard = new MotherBoard("AsusROG 9310", "ASUS", 6, 3,"Asus bios 1.0120.930");
        Monitor myMonitor = new Monitor(new Resolution(50,50),"10x1xx7182a0","Eastinghouse");
        Case myCase = new Case("HyperCool", "Phantex", "900W Gold", myDimension);

        PC myPc = new PC(myCase, myMotherboard, myMonitor);
        myPc.description();
        myPc.powerUp();

    }








}
