package org.example.streamDemo;

import java.util.stream.Stream;

public class StreamString {
    public static void main(String[] args){
        Stream<String> stream = Stream.of("Rabiu", "Afolabi", "Nneka");
        stream.forEach(System.out::println);
    }
}
