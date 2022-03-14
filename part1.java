package workshop3;

public class part1 {

    private String Colour;
    private int EnginePower;
    private boolean ParkingBrake;
    private boolean Convertible;

    public part1() {
        Colour = null;
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }

    public part1(String Colour, int EnginePower,boolean ParkingBrake, boolean Convertible) {
        this.Colour = Colour;

        this.ParkingBrake = ParkingBrake;

        this.EnginePower = EnginePower;

        this.Convertible = Convertible;
    }

    public String getColour() {
        return Colour;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Màu nè :" + Colour);
        System.out.println("ParkingBrake  :" + Convertible);
        System.out.println("EnginePower  :" + EnginePower);
        System.out.println("Convertible  :" + Convertible);
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

}
