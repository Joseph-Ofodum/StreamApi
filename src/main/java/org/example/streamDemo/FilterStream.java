package org.example.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(202, 33, 34, 1223, 40);
        List<Integer> myList= new ArrayList<>();
//        for (int n:list
//             ) {
//          if (n%2==0){
//              myList.add(n);
//              System.out.println(myList);
//          }
//        }
       myList = list.stream().filter(n-> n % 2 ==0).collect(Collectors.toList());
        System.out.println(myList);
    }
}
