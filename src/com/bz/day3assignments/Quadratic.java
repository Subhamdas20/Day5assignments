package com.bz.day3assignments;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a=sc.nextDouble();
        System.out.println("Enter the value of b");
        double b=sc.nextDouble();
        System.out.println("Enter the value of b");
        double c=sc.nextDouble();
        double delta,root1,root2;
        delta=((b*b)-(4*a*c));
        root1=(-b + Math.sqrt(delta))/(2*a);
        root2=(-b - Math.sqrt(delta))/(2*a);
        System.out.println("Root 1 of x is ="+root1);
        System.out.println("Root 2 of x is ="+root2);
    }
}