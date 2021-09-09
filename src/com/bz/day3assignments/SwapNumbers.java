package com.bz.day3assignments;

public class SwapNumbers {
    public static void main(String[] args) {
        int number1=5,number2=7,temporaryNumber;
        temporaryNumber=number1;
        number1=number2;
        number2=temporaryNumber;
        System.out.println("After swapping value of number1 =5");
        System.out.println("After swapping value of number2 =7");
        System.out.println("After swapping value of number1 ="+number1);
        System.out.println("After swapping value of number2 ="+number2);
    }
}
