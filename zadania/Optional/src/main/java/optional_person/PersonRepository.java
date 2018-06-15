package optional_person;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

public class PersonRepository {

    public static void main(String[] args) {

        Optional<Person> person = Optional.of(new Person(0, "Krzysztof", " Kaczyński", 40));
        Optional<Person> person1 = Optional.of(new Person(1, "Marek", " Kowalski", 30));
        Optional<Person> person2 = Optional.of(new Person(2, "Karol", " Stachowicz", 45));
        Optional<Person> person3 = Optional.of(new Person(3, "Ala", " Zdun", 25));

        List<Optional<Person>> personList = new ArrayList<>();

        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        System.out.println(personList);

        Optional.ofNullable(personList.get(0)).ifPresent(System.out::println);
        personList.getId().ifPresent(System.out::println);
        System.out.println(personList.getId().map(value -> id + value).orElse("brak ID"));
    }



}