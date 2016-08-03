package ru.sbt.ivanov.lesson05.Practice;

import java.util.List;

/**
 * Created by i.viktor on 03/08/16.
 */
public interface Store {
    void save(String s);

    List<String> getAll();
}
