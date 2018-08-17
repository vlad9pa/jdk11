package com.vlad9pa.jdk11test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Vlad Miliutin
 **/
public class VarExample {

    public static void main(String[] args) {
        var list = new ArrayList<String>();

        var stream = list.stream();

        var string = "Hello";

        list.add(string);

        if (stream.anyMatch("Hello"::equals)) {
            System.out.println("Hello world");
        }

        var newList = Stream.builder().add("Word one").add("Word Two").build();

        newList.forEach((str) -> list.add((String) str));

        list.forEach(System.out::println);
    }
}
