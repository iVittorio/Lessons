package ru.sbt.ivanov.lesson06;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.viktor on 06/08/16.
 */
public class ReflectionUtils {
    public static void printHierarchy (Object o ) {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            System.out.println(clazz);
            clazz = clazz.getSuperclass();
        }
    }

    public static List<String> printAllMethod(Object o) {
        Class<?> clazz = o.getClass();
        List<String> list = new ArrayList<>();

        while (clazz != null) {
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                list.add(method.getName());
            }
            clazz = clazz.getSuperclass();
        }
        return list;
    }

    public static void invokeAllGetters(Object o) {
        List<String> list = printAllMethod(o);
        try {
            for (String s : list) {
                if(s.startsWith("get")) {

                    invokeMethod(o,s);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void invokeMethod(Object o, String methodName) {
        Class<?> clazz = o.getClass();

        try {
            Method method = clazz.getMethod(methodName);
            if(method.getParameterCount() > 0) {
                throw new IllegalArgumentException("Method " + methodName + " with parameter");
            }
            if(method.getReturnType() != void.class)
                method.setAccessible(true);
                Object obj = method.invoke(o);
                System.out.println(o);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException("Exception during reflection access", e);
        }
    }
}
