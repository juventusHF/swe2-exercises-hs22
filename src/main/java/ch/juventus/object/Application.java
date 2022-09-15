package ch.juventus.object;

public class Application {

    public static void main(String[] args) {
        Address address1 = new Address("Musterstrasse", 1, 8001, "Zürich");
        Person person1 = new Person("Max","Muster", address1, 30, true);

        Address address2 = new Address("Musterstrasse", 1, 8001, "Zürich");
        Person person2 = new Person("Max","Muster", address2, 30, true);

        System.out.println(person1);

        System.out.println(person1.equals(person2));

    }



}
