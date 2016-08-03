package ru.sbt.ivanov.lesson05.Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by i.viktor on 03/08/16.
 */
public class FileStore implements Store {
    private final String s;

    public FileStore(String s) {
        this.s = s;
    }

    @Override
    public List<String> getAll() {
        List<String> list;

        try {
            list = Files.readAllLines(new File(this.s).toPath());
        } catch (IOException e) {
            throw new StoreException("Can't read file", e);
        }

        return list;
    }

    @Override
    public void save(String s) {
        try {
            FileWriter fileWriter = new FileWriter(this.s);
            fileWriter.write(s);
            fileWriter.append("\n");
        } catch (IOException e) {
            throw new StoreException("Can't write to file", e);
        }
    }
}
