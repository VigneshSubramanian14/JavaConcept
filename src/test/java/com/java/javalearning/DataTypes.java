package com.java.javalearning;

public class DataTypes {

    //To define a variable
    //int,double,char,boolean
    //String - special Class

    public void dataTypesMethod() {
        int a = 10;
        char b = 'A';
        double d = 123.33;
        boolean e = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+" "+b);
        System.out.println(d);
        System.out.println(e);
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        DataTypes obj = new DataTypes();
        obj.dataTypesMethod();
    }

}
