package com.bz.day3assignments;

import java.util.Scanner;

public class LibraryForArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of rows");
        int column = sc.nextInt();
        int[][] array = new int [row][column];
        int i,j,k,l;
        for ( i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the array elements");
                array[i][j] = sc.nextInt();
            }
        }
                for ( k = 0; k < row; k++) {
                    for ( l = 0; l < column; l++) {
                        System.out.print(array[k][l] + " ");
                    }
                        System.out.println();
                    }


    }

}

