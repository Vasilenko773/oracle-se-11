package oracle.se.part1.extending;

public abstract class AutomatedVahicle extends Vehicle {

    public AutomatedVahicle(VehicleType type, String owner, String make) {
        super(type, owner, make);
    }

    @Override
    public void drive() {
        autoDrive();
    }

    @Override
    public void park() {
        autoPark();
    }

    public abstract void autoDrive();

    public abstract void autoPark();

}
