package com.bz.day3assignments;

import java.util.Scanner;
public class Classwork{


    public void arrayIntPrint(int row , int column) {

        Scanner sc = new Scanner(System.in);
        int[][] array =  new int[row][column];
        int i, j, k, l;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.println("Enter the  array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextInt();
            }
        }

        for (k = 0; k < array.length; k++) {
            for (l = 0; l < array[k].length; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        Classwork obj = new Classwork();
        obj.arrayIntPrint(row, column);

    }
}
