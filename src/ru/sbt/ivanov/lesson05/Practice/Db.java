package ru.sbt.ivanov.lesson05.Practice;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by i.viktor on 03/08/16.
 */
public interface Db extends AutoCloseable {
    void insert(String line) throws SQLException;

    List<String> selectAll() throws SQLException;

    void close();
}
