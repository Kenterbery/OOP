package lab7;

import lab6.Car;

import java.util.Iterator;

/**
 * Created by kenterbery on 30.05.17.
 */
public class MyIterator implements Iterator<Car> {

    private Node current;

    public MyIterator(Node head) {
        current = head;
    }

    @Override
    public boolean hasNext() {
        return current.next() != null;
    }

    @Override
    public Car next() {
        Car next = current.getValue();
        current = current.next();
        return next;
    }
}
