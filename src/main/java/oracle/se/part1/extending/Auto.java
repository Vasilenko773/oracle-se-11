package oracle.se.part1.extending;

public class Auto extends Vehicle {

    public Auto(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void drive() {
        System.out.println("drive auto");
    }

    @Override
    public void park() {
        System.out.println("park auto");
    }

    @Override
    public void makeNoise() {
        System.out.println("make noise auto");
    }

    public static void main(String[] args) {
        Auto car = new Auto(VehicleType.Automobile, "Steeven", "Mazda");
        System.out.println(car);
        car.drive();
        car.park();
        car.makeNoise();
    }
}
