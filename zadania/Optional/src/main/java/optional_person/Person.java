package optional_person;

import java.util.Optional;

public class Person {
/**

 */

    private int id;
    private String name;
    private String surname;
    private int age;

    public  Optional<Integer> getId() {
        return Optional.ofNullable(id);
    }

    public Optional getName() {
        return Optional.ofNullable(name);
    }

    public Optional getSurname() {
        return Optional.ofNullable(surname);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }



    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}
