package com.java.javalearning;

public class LoopingConcept {

    public void loopingMethod() {
        //for loop:
        //initialization , declaration, increment or decrement

        for (int value = 1; value <= 10; value = value + 2) {
            System.out.println(value);
        }
        System.out.println("*****************************");
        //while loop
        int a=0;
        while (a<=10){
            System.out.println(a);
            a=a+1;
        }

    }

    public static void main(String[] args) {
        LoopingConcept obj = new LoopingConcept();
        obj.loopingMethod();
    }
}
