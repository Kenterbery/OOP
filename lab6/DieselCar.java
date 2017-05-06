package lab6;

/**
 * Created by kenterbery on 05.05.17.
 */
public class DieselCar extends Car {

    private final double fuel;

    public DieselCar(String name, int cost, int speed, double fuel) {
        super(name, cost, speed);
        this.fuel = fuel;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Dieselcar("+getName()+')';
    }
}
