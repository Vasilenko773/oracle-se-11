package oracle.se.part1.extending;

class Motorcycle extends Vehicle {

    public Motorcycle(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void drive() {
        System.out.println("drive motorcycle");
    }

    @Override
    public void park() {
        System.out.println("drive motorcycle");
    }

    @Override
    public void makeNoise() {
        System.out.println("make noise motorcycle");
    }
}


public class TestVehicle {

    public static void main(String[] args) {

        Auto car = new Auto(Vehicle.VehicleType.Automobile, "Hoares", "Elza");
        AutomatedAuto auto = new AutomatedAuto(Vehicle.VehicleType.Automobile, "Bard", "Honda");
        Motorcycle moto = new Motorcycle(Vehicle.VehicleType.Motorcycle, "Huan", "Pedrp");
        drive(car);
        drive(auto);
        drive(moto);

    }

    public static void drive(Vehicle v) {
        System.out.println(v.getClass().getName() + " ");
        v.drive();
    }

    public static void park(Vehicle v) {
        System.out.println(v.getClass().getName() + " v");
        v.drive();
    }
}
