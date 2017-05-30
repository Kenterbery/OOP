package lab7;

import lab6.Car;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static java.lang.reflect.Array.newInstance;

public class MySet implements Set<Car>{

    private int size = 0;
    private Node head = null;
    private Node tail = null;

    public MySet() {}

    public MySet(Car car) {
        add(car);
    }

    public Node getHead(){
        return head;
    }
    public Node getTail() {
        return tail;
    }

    public MySet(Car... cars) {
        Collections.addAll(this, cars);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (size == 0) {
            return false;
        }
        Node current = head;
        for (int i = 0; i < size; i++) {
            if (current.getValue() == o) {
                return true;
            }
            current = current.next();
        }
        return false;
    }

    @NotNull
    @Override
    public Iterator<Car> iterator() {
        return new MyIterator(head);
    }

    @NotNull
    @Override
    public Object[] toArray() {
        Object[] carArray = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            carArray[i] = current.getValue();
            current = current.next();
        }
        return carArray;
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        if (a.length < size) {
            a = (T[]) newInstance(a.getClass().getComponentType(), size);
        } else if (a.length > size) {
            a[size] = null;
        }
        int counter = 0;
        for (Object e: this.toArray()) {
            a[counter++] = (T) e;
        }
        return a;
    }

    @Override
    public boolean add(Car car) {
        if (this.contains(car)) {
            return false;
        }
        Node node = new Node(car);
        if (tail == null) {
            head = node;
            tail = node;
            head.setNext(tail);
        }
        else {
            tail.setNext(node);
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            if (head.getValue() == o) {
                head = head.next();
                return true;
            }
            Node current = head;
            for (int i = 1; i < size; i++) {
                if (current.next().getValue() == o) {
                    current.setNext(current.next().next());
                    size--;
                    return true;
                }
                current = current.next();
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends Car> c) {
        if (containsAll(c)) {
            return false;
        }
        for (Object car : c) {
            if (!contains(car)) {
                this.add((Car) car);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        boolean flag = true;
        for (Object car : this.toArray()) {
            if (!c.contains(car)) {
                flag &= this.remove(car);
            }
        }
        return flag;
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        boolean flag = true;
        for (Object car : c) {
            flag &= this.remove(car);
        }
        return flag;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}