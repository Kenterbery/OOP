package lab7;

import lab6.Car;
import lab6.PetrolCar;

import java.util.Iterator;

/**
 * Created by kenterbery on 01.06.17.
 */
public class Main {

    static Car car1 = new PetrolCar("BMW M3", 1946507, 280, 8.8);
    static MySet taxis = new MySet(car1);

    //static Car car2 = new PetrolCar("asdfas", 1946507, 280, 8.8);

    public static void main(String[] args) {
        //taxis.add(car2);
        System.out.println(taxis.remove(car1));
        System.out.println(taxis.remove(car1));
        System.out.println(taxis.add(null));
        System.out.println(taxis.toArray());
    }
}
