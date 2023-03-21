package com.test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class laba1 {
    public static void main(String[] args) {
        int c2, c3, c5, c7;
        int scorebook_num = 2326;
        boolean flag = true;
        System.out.println("your number of the scorebook is 2326");
        while (true) {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Enter your number a:");
                int a_num = scan.nextInt();
                System.out.println("Enter your number b");
                int b_num = scan.nextInt();

                System.out.println("Enter your number n");
                int n_num = scan.nextInt();
                if (n_num < a_num) {
                    System.out.println("upper limit must be lower");
                    continue;
                }
                System.out.println("Enter your number m");
                int m_num = scan.nextInt();
                if (m_num < b_num) {
                    System.out.println("upper limit must be lower");
                    continue;
                }
                c2 = scorebook_num % 2;
                System.out.println("\n" + c2 + " - c2\nyour operation 1 is '+'");
                c3 = scorebook_num % 3;
                System.out.println(c3 + " - c3\nyour c3 const is '1'\n");
                c5 = scorebook_num % 5;
                System.out.println(c5 + " - c5\nyour operation 2 is '*'\n");
                c7 = scorebook_num % 7;
                System.out.println(c7 + " - c7\nyour i,j type is int\n");
                int result = 0;
                for (int i = a_num; i <= n_num; i++) {
                    int summ1 = 0;
                    for (int j = b_num; j <= m_num; j++) {
                        if (i + c3 != 0) {
                            summ1 += (i * j) / (i + c3);
                        } else {
                            flag = false;
                            break;
                        }
                    }
                    result += summ1;
                }
                if (flag == true) {
                    System.out.println("your result is: " + result);
                } else {
                    System.out.println("ERROR\nyou can't divide by 0");
                }
                break;

            } catch (InputMismatchException exc) {
                System.out.println("enter number,please");
            }
        }
    }
}