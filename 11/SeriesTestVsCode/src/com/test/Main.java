package com.test;

import com.company.Series;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
    }

}
