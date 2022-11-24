package ch.juventus.sorting;

import ch.juventus.object.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int firstName = o1.getFirstName().compareTo(o2.getFirstName());
        if (firstName == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return firstName;
    }
}
