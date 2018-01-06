package lambdaDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by byung-chunyoo on 6/25/17.
 */
public class Unit1ExcerciseSolutionJava7 {
    public static void main (String [] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //Step1. sort list by last name

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());//by age use, return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        //Step2. Create a method that prints all elements in the list
        printAll(people);

        //Step3. Create a method that prints all people that have last name beginning with C.
//        printAllNamesBeginningWithC(people);
//    }
//    private static void printAllNamesBeginningWithC(List<Person> people) {
//        for (Person person: people){
//            if(person.getLastName().startsWith("C")){
//                System.out.println(person);
//            }
//        }
//    }
        //Step3 more conditional version. private method is now flexible to handle any condition.
        System.out.println(" ");
        printConditionally(people, new Conditon() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("D");
            }
        });

        System.out.println(" ");

        //same as above except it is with firstName
        printConditionally(people, new Conditon() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });
    }
    private static void printConditionally(List<Person> people, Conditon conditon) {
        for (Person person: people){
            if(conditon.test(person)){
                System.out.println(person);
            }
        }
    }
    private static void printAll(List<Person> people) {
        for (Person person: people){
            System.out.println(person);
        }
    }
}

interface Conditon{
    public boolean test(Person person);
}