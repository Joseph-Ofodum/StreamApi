package org.example.streamDemo;


import java.util.stream.Stream;

public class IteratedStream {
    public static void main(String[] args){
        Stream<Integer> iterated = Stream.iterate(100, n-> n / 2).limit(4);
        iterated.forEach(System.out::println);

    }
}
