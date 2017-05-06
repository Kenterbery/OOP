package lab6;

/**
 * Created by kenterbery on 05.05.17.
 */
public class ElectroCar extends Car {

    public ElectroCar(String name, int cost, int speed) {
        super(name, cost, speed);
    }

    @Override
    public double getFuel() {
        return 0;
    }

    @Override
    public String toString() {
        return "Electrocar("+getName()+')';
    }
}
