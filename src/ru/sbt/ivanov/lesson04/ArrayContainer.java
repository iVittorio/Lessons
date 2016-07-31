package ru.sbt.ivanov.lesson04;


/**
 * Created by i.viktor on 30/07/16.
 */
public class ArrayContainer<E> implements Container<E> {
    private final E[] objects;
    int size;

    public ArrayContainer(int size) {
        this.objects = (E[]) new Object[size];
    }

    @Override
    public void add(E o) {
        objects[size++] = o;
    }

    @Override
    public void remove(E o) {
        objects[--size] = o;
    }

    @Override
    public E getFirst() {
        return objects[0];
    }

    @Override
    public E getLast() {
        return objects[objects.length - 1];
    }
}
