package ru.sbt.ivanov.lesson05.Practice;

/**
 * Created by i.viktor on 03/08/16.
 */
public class StoreException extends RuntimeException {
    public StoreException(String message, Throwable cause) {
        super(message, cause);
    }
}
