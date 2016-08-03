package ru.sbt.ivanov.lesson05.Practice;

/**
 * Created by i.viktor on 03/08/16.
 */
public class DbException extends StoreException {
    public DbException(String message, Throwable cause) {
        super(message, cause);
    }
}
