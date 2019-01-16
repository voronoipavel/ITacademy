package oop.exem.exem2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();

       try {
           Person person1 = new Person("Иванов", "Иван", "Иванович");
           Person person2 = new Person("Иванов", "Иван", "Иванович");

           person1.equals(person2);
           persons.add(person1);
           persons.add(person2);

           for (Person p : persons) {
               System.out.println(p);
           }
       }
       catch (Exception e){
           new Exception();
           e.printStackTrace();
       }
    }
}
