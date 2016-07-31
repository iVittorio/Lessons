package ru.sbt.ivanov.lesson04;

/**
 * Created by i.viktor on 30/07/16.
 */
public class ContainerMain {
    public void run(Container<String> container) {
        container.add("hello");

        String first = container.getFirst();
    }
}
