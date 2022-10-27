package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class Application {

    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        System.out.println("start of the code");
        try {
            personRepository.findById(1);
        } catch (PersonNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("after person not found");

        personRepository.addPerson(new Person("Hans", "Muster"));

        System.out.println("end of the code");
    }

}
