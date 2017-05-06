package lab6;

/**
 * Created by kenterbery on 05.05.17.
 */
public abstract class Car {

    private final String name;
    private final int cost;
    private final int speed;

    public Car (String name, int cost, int speed) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public abstract double getFuel();

    public abstract String toString();
}
