package com.bz.day3assignments;

import java.util.Scanner;
public class LibraryForArray {
    static void arrayIntPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();

        int[][] array = new int[row][column];
        int i, j, k, l;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the integer array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextInt();
            }
        }
        for (k = 0; k < row; k++) {
            for (l = 0; l < column; l++) {
                System.out.print(array[k][l] + " ");
            }
            System.out.println();
        }
    }
        static void arrayDoublePrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        double[][] array = new double[row][column];
        int i,k,j, l;

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the decimal array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextDouble();
            }
        }
        for (k = 0; k < row; k++) {
            for (l = 0; l < column; l++) {
                System.out.print(array[k][l] + " ");

            }
            System.out.println();
        }

    }
    static void arrayBooleanPrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns");
        int column = sc.nextInt();
        boolean[][] array = new boolean[row][column];
        int i,k,j, l;

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the boolean array elements of row " + i + " and column " + j);
                array[i][j] = sc.nextBoolean();
            }
        }
        for (k = 0; k < row; k++) {
            for (l = 0; l < column; l++) {
                System.out.print(array[k][l] + " ");

            }
            System.out.println();
        }

    }

        public static void main (String[]args){

            arrayIntPrint();
            arrayDoublePrint();
            arrayBooleanPrint();
        }

}

