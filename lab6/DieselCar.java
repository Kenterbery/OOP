package lab6;

/**
 * Клас, що описує машину на дизпаливі, наслідує Car
 */
public class DieselCar extends Car {

    private final double fuel;

    /**
     * Конструктор, що створюэ машину з назви, вартості, швидкості
     * і витрат палива
     * @param name
     * @param cost
     * @param speed
     * @param fuel
     */
    public DieselCar(String name, int cost, int speed, double fuel) {
        super(name, cost, speed);
        this.fuel = fuel;
    }

    /**
     * Повертає витрати пального (дизель)
     * @return Витрати пального (дизель)
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
        return "Dieselcar("+getName()+')';
    }
}
