package ru.sbt.ivanov.lesson03;

/**
 * Created by i.viktor on 27/07/16.
 */
public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public int compareTo(Person o) {
        int compare = Integer.compare(age, o.age);
        if(compare != 0) return compare;
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
