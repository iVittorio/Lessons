package ru.sbt.ivanov.lesson06;

import java.util.Date;
import java.util.List;

/**
 * Created by i.viktor on 06/08/16.
 */
public class Main {
    public static void main(String[] args) {
       // ReflectionUtils.printHierarchy("Hello");

       /* List<String> list = ReflectionUtils.printAllMethod(new Date());
        for(String s : list) {
            System.out.println(s);
        } */

        ReflectionUtils.invokeAllGetters("asd");
    }
}
