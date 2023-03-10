package org.example.streamDemo;

public class ToBeDeleted {
    static String s1 = "abc";
    static String s2 = "def";
    static String s3 = "abcdef";



    public static void main(String[] args){
        System.out.println(s3.equals(s1 + s2));
    }
}
