package PartVI;

import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    public static final int COMING_OF_AGE = 18;

    public Person() {
        // default constructor
    }

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // method for formatted console output of instance fields
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth Year: " + birthYear);
    }

    // method to check if person is adult
    public boolean isAdult() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthYear;
        return age >= COMING_OF_AGE;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setSurname("Doe");
        person1.setBirthYear(1990);
        person1.printPersonInfo(); // prints "Name: John\nSurname: Doe\nBirth Year: 1990"
        System.out.println("Is Adult:");
        System.out.println(person1.isAdult()); // prints "true"

        Person person2 = new Person("Jane", "Doe", 1985);
        person2.printPersonInfo(); // prints "Name: Jane\nSurname: Doe\nBirth Year: 1985"
        System.out.println("Is Adult:");
        System.out.println(person2.isAdult()); // prints "true"
    }
}
