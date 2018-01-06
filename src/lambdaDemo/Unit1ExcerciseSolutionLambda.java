package lambdaDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionLambda {
    public static void main (String [] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //Step1. sort list by last name
//        Collections.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getLastName().compareTo(o2.getLastName());
//            }
//        });

        //Step1 lambda
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));


        //Step2. Create a method that prints all elements in the list
        printConditionally(people, person -> true);

        //Step3 more conditional version. private method is now flexible to handle any condition.
        System.out.println(" ");
//        printConditionally(people, new Conditon() {
//            @Override
//            public boolean test(Person person) {
//                return person.getLastName().startsWith("D");
//            }
//        });

        //Step3 lambda
        printConditionally(people, person -> person.getLastName().startsWith("B"));

        System.out.println(" ");

//        //same as above except it is with firstName
//        printConditionally(people, new Conditon() {
//            @Override
//            public boolean test(Person person) {
//                return person.getFirstName().startsWith("M");
//            }
//        });

        //lambda: same as above except it is with firstName
        printConditionally(people, person -> person.getFirstName().startsWith("T"));
    }


    //Java8 has util.function package which has many interfaces that can be used in Lambda if method signature and return type are consistent.
    //Predicate inferfase has test method with boolean return type which is the same as Condition inferface below.
    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person person: people){
            if(predicate.test(person)){
                System.out.println(person);
            }
        }
    }

    //compare it with above method which is same except using a out-of-box interface.
//    private static void printConditionally(List<Person> people, Conditon conditon) {
//        for (Person person: people){
//            if(conditon.test(person)){
//                System.out.println(person);
//            }
//        }
//    }
    //below can be removed and step2 method above is changed to lambda.
//    private static void printAll(List<Person> people) {
//        for (Person person: people){
//            System.out.println(person);
//        }
//    }
}
