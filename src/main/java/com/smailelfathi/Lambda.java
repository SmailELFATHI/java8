package com.smailelfathi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {

        //Java 7 code to print an array
        System.out.println("Java 7 code to print an array");
        List<Integer> intList = Arrays.asList(1,2,3);
        for ( Integer i:intList
             ) {
            System.out.println(i);

        }

        //Java 8 provides a forEach method to do the same thing...
        System.out.println("Java 8 provides a forEach method to do the same thing...");
        intList.forEach(new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        //Java 8’s Lambda’s make forEach beautiful
        System.out.println("Java 8’s Lambda’s make forEach beautiful");
        intList.forEach((i) -> System.out.println(i));
        intList.forEach(i -> System.out.println(i));

        // Using lambda expression to print even elements of list
        System.out.println("Using lambda expression to print even elements of list");
        intList.forEach(n -> { if (n%2 == 0) System.out.println(n); });
        //Note that lambda expressions can only be used to implement functional interfaces. In the above example also,
        // the lambda expression implements Consumer Functional Interface.

        //We can make the last line even shorter!
        System.out.println("We can make the last line even shorter!");
        intList.forEach(System.out::println);



    }
}
