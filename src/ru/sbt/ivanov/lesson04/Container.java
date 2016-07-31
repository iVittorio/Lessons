package ru.sbt.ivanov.lesson04;

import java.util.Objects;

/**
 * Created by i.viktor on 30/07/16.
 */
public interface Container<E> {
    void add(E o);

    void remove(E o);

    E getFirst();

    E getLast();
}
