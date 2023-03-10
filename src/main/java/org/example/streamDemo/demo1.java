package org.example.streamDemo;

import java.util.stream.Stream;

public class demo1 {
    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 50);
        stream.forEach(System.out::println);
    }
}
