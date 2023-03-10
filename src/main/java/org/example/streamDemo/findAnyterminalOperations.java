package org.example.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findAnyterminalOperations {
    public static void main(String[] args){
        List<String> lists = Arrays.asList("anayo","chigozie", "ebuka",  "kenneth");
        Optional<String> ans= lists.stream().findAny();
        System.out.println(ans);
    }

}
