package com.test;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
public class laba2 {
    public static void main(String[] args) {
        int c5, c7, c11;
        int scorebook_num = 2326;
        System.out.println("your number of the scorebook is 2326");
        c5 = scorebook_num % 5;
        System.out.println(c5 + " - c5\nyour 1st operation is C=Bт\n");
        c7 = scorebook_num % 7;
        System.out.println(c7 + " - c7\nyour elements type is short\n");
        c11 = scorebook_num % 7;
        System.out.println(c11 + " - c11\nCalculate the sum of the largest elements of each matrix column \n");

        Scanner scan = new Scanner(System.in);
        while (true) {
            try{
            System.out.println("enter number of rows");
            short i = scan.nextShort();
            System.out.println("enter number of column");
            short j = scan.nextShort();
            if (i != j) {
                System.out.println("i!=j,operations are not available for non-square matrices");
                continue;
            }

            short[][] matrixB = new short[i][j];
            short[][] matrixC = new short[i][j];
            Random rand = new Random();
            for (int n = 0; n < i; n++) {
                for (int m = 0; m < j; m++) {
                    matrixB[n][m] = (short) rand.nextInt(100);
                    matrixC[m][n] = matrixB[n][m];
                }
            }
            System.out.println("Matrix B:");
            for (int n = 0; n < i; n++) {
                for (int m = 0; m < j; m++) {
                    System.out.print(matrixB[n][m] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix C(Bт):");
            for (int n = 0; n < i; n++) {
                for (int m = 0; m < j; m++) {
                    System.out.print(matrixC[n][m] + " ");
                }
                System.out.println();
            }
            short maxnum = 0;
            short summ = 0;
            for (int n = 0; n < j; n++) {
                for (int m = 0; m < i; m++) {
                    if (matrixC[m][n] > maxnum) {
                        maxnum=matrixC[m][n];
                    }
                }
                summ +=maxnum;
                maxnum = 0;
            }
            System.out.println("sum of the largest elements of each matrix column is:\n"+summ);
            break;}
            catch (InputMismatchException exc) {
                System.out.println("enter number,please");
            }
        }
    }
}