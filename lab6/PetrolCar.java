package lab6;

/**
 * Клас описує машини на бензині, наслідує клас Car
 */
public class PetrolCar extends Car {

    private final double fuel;

    public PetrolCar(String name, int cost, int speed, double fuel) {
        super(name, cost, speed);
        this.fuel = fuel;
    }

    /**
     * Повертає витрати пального
     * @return Витрати пального
     */
    @Override
    public double getFuel() {
        return fuel;
    }

    /**
     * Повертає строкове представлення машини
     * @return Строкове представлення машини
     */
    @Override
    public String toString() {
        return "Petrolcar("+getName()+')';
    }
}
