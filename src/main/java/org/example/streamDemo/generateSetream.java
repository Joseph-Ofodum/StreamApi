package org.example.streamDemo;

import java.util.stream.Stream;

public class generateSetream {
    public static  void main(String[] args){
        Stream<String> generated = Stream.generate(()-> "I love Java").limit(10);
        generated.forEach(System.out::println);
    }
}
