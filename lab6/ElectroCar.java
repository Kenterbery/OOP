package lab6;

/**
 * Клас що описує електрокар, наслідує клас Car
 */
public class ElectroCar extends Car {
    /**
     * Конструктор без палива
     * @param name
     * @param cost
     * @param speed
     */
    public ElectroCar(String name, int cost, int speed) {
        super(name, cost, speed);
    }

    /**
     * Повертає витрати палива. Так як це електрокар,
     * витрат палива не має.
     * @return Витрати палива (0).
     */
    @Override
    public double getFuel() {
        return 0;
    }

    /**
     * Повертає строкове представлення машини
     * @return Строкове представлення машини
     */
    @Override
    public String toString() {
        return "Electrocar("+getName()+')';
    }
}
