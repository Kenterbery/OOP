package lab6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Клас, що описує таксопарк
 */
public class Taxis {

    private final Car[] cars;

    /**
     * Створює екземпляр таксопарку із заданими машинами,
     * водночас сортує його за витратами пального
     * @param cars
     */
    public Taxis(Car... cars) {
        this.cars = cars;
        Arrays.sort(this.cars, Comparator.comparing(Car::getFuel));
    }

    /**
     * Повертає розмір таксопарку як довжину списку машин
     * @return
     */
    public int size() {
        return cars.length;
    }

    /**
     * Повертає машину за вказаним індексом
     * @param index Індекс машини
     * @return Машина за індексом
     */
    public Car getCars(int index) {
        return cars[index];
    }

    /**
     * Метод підраховує загальну вартість таксопарку
     * @return
     */
    public int getTotalCost() {
        int cost = 0;
        for(Car car: cars) {
            cost += car.getCost();
        }
        return cost;
    }

    /**
     * Метод знаходить машину в заданому діапазоні швидкостей
     * @param min Мінімальна швидкість
     * @param max Максимальна швидкість
     * @return Перша знайдена машина, якщо існує, інакше - null
     */
    public Car findCarWithSuchSpeed(int min, int max) {
        for(Car car : cars) {
            int speed = car.getSpeed();
            if(speed>=min && speed<=max) {
                return car;
            }
        }
        return null;
    }
}
