package oracle.se.part1.extending;

public class AutomatedAuto extends AutomatedVahicle {

    public AutomatedAuto(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void makeNoise() {
        System.out.println("make Noise AutomatedAuto");
    }

    @Override
    public void autoDrive() {
        System.out.println("auto drive AutomatedAuto");
    }

    @Override
    public void autoPark() {
        System.out.println("auto park AutomatedAuto");
    }

    public static void main(String[] args) {
        AutomatedAuto automatedAuto = new AutomatedAuto(VehicleType.Moped, "Huares", "Almeca");
        System.out.println(automatedAuto);
        automatedAuto.drive();
        automatedAuto.park();
        automatedAuto.makeNoise();
        automatedAuto.set();
    }
}



