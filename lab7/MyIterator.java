package lab7;

import lab6.Car;

import java.util.Iterator;

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
        Car car = current.getValue();
        if (hasNext()) {
            this.current = current.next();
        }
        return car;
    }
}
