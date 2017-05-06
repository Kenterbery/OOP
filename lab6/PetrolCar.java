package lab6;

/**
 * Created by kenterbery on 05.05.17.
 */
public class PetrolCar extends Car {

    private final double fuel;

    public PetrolCar(String name, int cost, int speed, double fuel) {
        super(name, cost, speed);
        this.fuel = fuel;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Petrolcar("+getName()+')';
    }
}
