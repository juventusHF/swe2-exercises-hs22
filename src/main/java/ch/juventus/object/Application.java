package ch.juventus.object;

public class Application {

    public static void main(String[] args) {
        Address address = new Address("Musterstrasse", 1, 8001, "Zürich");
        Person person = new Person("Max","Muster", address, 30, true);

        System.out.println(person);
    }



}
