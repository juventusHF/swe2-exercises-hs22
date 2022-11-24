package ch.juventus.sorting;

import ch.juventus.object.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Hans", "Muster"));
        people.add(new Person("Peter", "Keller"));
        people.add(new Person("Peter", "Kuster"));
        people.add(new Person("Lisa", "Muster"));

        people.sort(new PersonComparator());

        System.out.println(people);
    }

}
