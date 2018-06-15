package person_list;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Person> pracownicy = new HashSet<>();

        Person person = new Person("Jan", "Kowalski");
        Person person1 = new Person("Ola", "Olech");
        Person person2 = new Person("Mały", "Kriszo");
        Person person3 = new Person("Pan", "Cegła");
        Person person4 = new Person("Jan", "Kowalski");

        pracownicy.add(person);
        pracownicy.add(person1);
        pracownicy.add(person2);
        pracownicy.add(person3);
        pracownicy.add(person4);

        System.out.println(pracownicy.equals(person4));
        person4.setName("Pała");
        System.out.println(person4);
        System.out.println(pracownicy.contains(person4));
    }
}
