package ru.sbt.ivanov.lesson04;

import java.util.Map;

/**
 * Created by i.viktor on 30/07/16.
 */
public interface CountMap<E> {

    void add(E o);

    int getCount(E o);

    //current count
    int remove(E o );

    int size();

    void addAll (CountMap<? extends E> source);

    Map<E, Integer> toMap();

    void toMap (Map<? super E, Integer> destination);

}
