package org.example;
import com.google.gson.Gson;

public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Ivan", "Ivanov", 35);
        Gson g = new Gson();

        String serializedPerson = g.toJson(p1);

        System.out.println(p1.toString());
        System.out.println(p1.hashCode());

        System.out.println(serializedPerson);

        Person p3 = g.fromJson(serializedPerson, Person.class);
        System.out.println(p1.equals(p3));






        }
}