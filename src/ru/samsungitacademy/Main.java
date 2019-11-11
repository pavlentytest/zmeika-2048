package ru.samsungitacademy;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
                                 // 5 -строк
                                 // 4 - столбцов
        int[][] matrix = new int[5][4];
        int k = 0;
        for (int i = 0; i < 5; i++) {

            if(i%2==0) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = k;
                    k++;
                }
            } else {
                for(int j=3;j>=0;j--) {
                    matrix[i][j] = k;
                    k++;
                }
            }
        }






        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
