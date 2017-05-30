package lab7;

import lab6.Car;

/**
 * Created by kenterbery on 07.05.17.
 */
public class Node {

    private Car value;
    private Node next;

    public Node(Car element) {
        this.value = element;
        this.next = null;
    }

    public Car getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node next() {
        return next;
    }
}
