package lab6;

/**
 * Абстрактний клас, що описує загальні властивості авто
 */
public abstract class Car {

    private final String name;
    private final int cost;
    private final int speed;

    /**
     * Конструктор, що має задати назву, вартість і швидкість
     * @param name
     * @param cost
     * @param speed
     */
    public Car (String name, int cost, int speed) {
        this.name = name;
        this.cost = cost;
        this.speed = speed;
    }

    /**
     * Повертає назву машини
     * @return Назва машини
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає вартість машини
     * @return Вартість машини
     */
    public int getCost() {
        return cost;
    }

    /**
     * Повертає швидкість машини
     * @return Швидкість машини
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Повертає витрати пального
     * @return Витрати пального
     */
    public abstract double getFuel();

    /**
     * Повертає строкове представлення машини
     * @return Строкове представлення
     */
    public abstract String toString();
}
