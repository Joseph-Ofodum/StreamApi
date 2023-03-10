package org.example.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamWithStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("obi", "Nkechi", "Jane", "Anayo", "Ebuka");
        List<String> result= new ArrayList<>();
        result = list.stream().filter(names->names != "Nkechi" && names.toLowerCase().startsWith("j")).collect(Collectors.toList());
        System.out.println(result);
        //if  I don't want to store in a different list
        list.stream().filter(names->names !="j" && names.toUpperCase().startsWith("E")).forEach(System.out::println);
    }
}
