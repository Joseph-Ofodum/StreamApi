package org.example.streamDemo;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args){
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream =builder.add("kit")
                                        .add("ball")
                                        .add("tennis")
                                        .add("call")
                                        .build();
        stream.forEach(System.out::println);
    }
}
