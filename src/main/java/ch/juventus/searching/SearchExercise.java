package ch.juventus.searching;

import ch.juventus.object.Person;

import java.util.HashMap;
import java.util.Map;

public class SearchExercise {

    private static final Map<Person, String> phoneNumberByPerson = Map.of(
            new Person("Hans", "Muster"), "0791234567",
            new Person("Peter", "Keller"), "0798912345",
            new Person("Peter", "Kuster"), "0795678912",
            new Person("Lisa", "Muster"), "0793456789"
    );

    public static void main(String[] args) {
        Person test1 = findByPhoneNumber("0795678912");
        Person test2 = findByPhoneNumber("123");

        System.out.println(test1);
        System.out.println(test2);
    }

    private static Person findByPhoneNumber(String phoneNumber) {
        if (phoneNumberByPerson.containsValue(phoneNumber)) {
            for (Map.Entry<Person, String> entry : phoneNumberByPerson.entrySet()) {
                if (phoneNumber.equals(entry.getValue())){
                    return entry.getKey();
                }
            }
        }
        return null;
    }

}
