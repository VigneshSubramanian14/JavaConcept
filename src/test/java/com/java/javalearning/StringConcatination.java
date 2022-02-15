package com.java.javalearning;

public class StringConcatination {

    public void stringConcat() {
        int a = 10;
        char b = 'C';

        System.out.println(a+" "+b);

        String name1="Sandhya";
        String name2="Krishna";

        System.out.println(name1+name2);
        System.out.println(name1+" "+name2);

    }

    public static void main(String[] args) {
        StringConcatination obj = new StringConcatination();
        obj.stringConcat();
    }
}
