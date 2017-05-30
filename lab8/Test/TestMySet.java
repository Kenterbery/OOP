package lab8.Test;

import lab6.Car;
import lab6.DieselCar;
import lab6.ElectroCar;
import lab6.PetrolCar;
import lab7.MySet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Iterator;

/**
 * Created by kenterbery on 30.05.17.
 */
public class TestMySet {

    private MySet taxis;
    private Car car;
    private MySet cars;

    @Before
    public void setParameters() {
        this.taxis = new MySet();
        this.car = new DieselCar("Renault Duster", 451000, 170, 4.75);
        this.cars = new MySet(new DieselCar("Renault Duster", 451000, 170, 4.75),
                new PetrolCar("BMW M3", 1946507, 280, 8.8),
                new ElectroCar("Smart ForTwo", 330000, 125),
                new PetrolCar("Ford Focus", 578943, 190, 8.7),
                new ElectroCar("BMW i3", 1530000, 160),
                new DieselCar("Volkswagen Caddy", 378000, 186, 7.8));
    }

    @Test
    public void testSize() {
        assertTrue(this.taxis.size() == 0);
        taxis.add(car);
        assertTrue(this.taxis.size() == 1);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(taxis.isEmpty());
        taxis.add(car);
        assertFalse(taxis.isEmpty());
    }

    @Test
    public void testContains() {
        assertFalse(taxis.contains(car));
        taxis.add(car);
        assertTrue(taxis.contains(car));
    }

    @Test
    public void testAdd() {
        assertTrue(taxis.add(car));
        taxis.add(car);
        assertFalse(taxis.add(car));
        assertTrue(taxis.add(null));
        System.out.println();
    }

    @Test
    public void testRemove() {
        assertFalse(taxis.remove(car));
        taxis.add(car);
        assertTrue(taxis.remove(car));
    }

    @Test
    public void testAddAll() {
        assertTrue(taxis.addAll(cars));
        assertFalse(taxis.addAll(cars));
    }

    @Test
    public void testClear() {
        taxis.addAll(cars);
        assertFalse(taxis.isEmpty());
        taxis.clear();
        assertTrue(taxis.isEmpty());
    }

    @Ignore
    @Test
    public void testRemoveAll() {
        taxis.addAll(cars);
        assertTrue(taxis.removeAll(cars));
        taxis.removeAll(cars);
        //assertFalse(taxis.removeAll(cars));
    }

    @Test
    public void testContainsAll() {
        taxis.addAll(cars);
        assertTrue(taxis.containsAll(cars));
        taxis.remove(car);
        assertTrue(taxis.containsAll(cars));
    }

    @Test
    public void testRetainAll() {
        taxis.addAll(cars);
        taxis.add(new DieselCar("Lada Calina", 300000, 200, 5.5));
        assertTrue(taxis.retainAll(cars));
    }

    @Test
    public void testToArray() {
        taxis.add(car);
        assertArrayEquals(taxis.toArray(), new Car[]{car});
    }

    @Test
    public void testToArrayT() {
        taxis.add(car);
        Car[] array = new Car[taxis.size()];
        Car[] arrayTest = new Car[taxis.size()];
        array = taxis.toArray(array);
        int counter = 0;
        for (Object plane : taxis.toArray()) {
            arrayTest[counter++] = (Car) car;
        }
        assertEquals(arrayTest, array);
    }

    @Test
    public void testIterator() {
        taxis.add(car);
        Iterator<Car> iterator = taxis.iterator();
        assertTrue(iterator.next() == car);
        assertTrue(iterator.hasNext());
    }
    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        Result result = runner.run(TestMySet.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}

