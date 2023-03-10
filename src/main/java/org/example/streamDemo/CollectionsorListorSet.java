package org.example.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsorListorSet<S> {
    public  static void main(String[] args){
        //this can be used for both list/set/collections/(creating stream from collections)
        List<String> collections = Arrays.asList(("ekene"), "ebuka", "anayo");
        Stream<String> stream = collections.stream();
        stream.forEach(System.out::println);

    }
}
