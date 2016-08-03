package ru.sbt.ivanov.lesson05.Practice;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by i.viktor on 03/08/16.
 */
public class DbStore implements Store {
    private final Db db;

    public DbStore(Db db) {
        this.db = db;
    }

    @Override
    public List<String> getAll() {
        List<String> list;
        try {
            list = db.selectAll();
        } catch (SQLException e) {
            throw new DbException("DataBase Error", e);
        }
        return list;
    }

    @Override
    public void save(String s) {
        try {
            db.insert(s);
        } catch (SQLException e) {
            throw new DbException("DataBase Error", e);
        }
    }
}
