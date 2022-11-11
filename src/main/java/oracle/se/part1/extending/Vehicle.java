package oracle.se.part1.extending;

import lombok.ToString;

@ToString
public abstract class Vehicle {

    protected enum VehicleType {
        Automobile, Motorcycle, Moped, Bicycle, Scooter
    }

    private VehicleType type;
    private String owner;
    private String make;

    public Vehicle(VehicleType type, String owner, String make) {
        this.type = type;
        this.owner = owner;
        this.make = make;
    }

    public abstract void drive();
    public abstract void park();
    public abstract void makeNoise();

    public void set() {
        System.out.println("sasdasd");
    }
}
