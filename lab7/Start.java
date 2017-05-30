package lab7;

import lab6.*;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        MySet test = new MySet();

        System.out.println(test.add(new PetrolCar("BMW M3", 1946507, 280, 8.8)));
        System.out.println(test.add(new PetrolCar("Ford Focus", 578943, 190, 8.7)));
        Car car = new DieselCar("Renault Duster", 451000, 170, 4.75);
        System.out.println(test.addAll(Arrays.asList(new ElectroCar("Smart ForTwo", 330000, 125),
                new ElectroCar("BMW i3", 1530000, 160),
                car, new DieselCar("Volkswagen Caddy", 378000, 186, 7.8))));


        System.out.println(test.contains(car));
        for (Object o : test.toArray()) {
            System.out.println(o);
        }
    }
}
