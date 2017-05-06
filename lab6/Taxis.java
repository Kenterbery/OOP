package lab6;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by kenterbery on 05.05.17.
 */
public class Taxis {

    private final Car[] cars;

    public Taxis(Car... cars) {
        this.cars = cars;
        Arrays.sort(this.cars, Comparator.comparing(Car::getFuel));
    }

    public int size() {
        return cars.length;
    }

    public Car getCars(int index) {
        return cars[index];
    }

    public int getTotalCost() {
        int cost = 0;
        for(Car car: cars) {
            cost += car.getCost();
        }
        return cost;
    }

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
