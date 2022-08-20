package Model;

import java.util.Scanner;

/**
 * Описываю класс человек
 */
public abstract class Person {
    String name;
    String surname;
    int age;
    Scanner iScanner = new Scanner(System.in);

    public Person() {}

    protected void setName() {
        System.out.println("Insert name");
        this.name = iScanner.nextLine();
    }

    protected void setSurname() {
        System.out.println("Insert surname");
        this.surname = iScanner.nextLine();
    }

    protected void setAge() {
        System.out.println("Insert age");
        this.age = iScanner.nextInt();
    }
}
