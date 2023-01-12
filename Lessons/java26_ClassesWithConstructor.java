package Lessons;

import java.beans.PersistenceDelegate;

public class java26_ClassesWithConstructor
{

    public static void main(String[] args)
    {
        Person person1 = new Person("Nathaniel","lastName",22);
        System.out.println(person1.age);
    }
}

class Person
{
    String name;
    String lastname;
    int age;

    public Person(String name, String lastname, int age)
    {
        this.name = name;
        this.lastname = lastname;
        this.age= age;
    }
}





