/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex13;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = in.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = in.nextInt();

        double result = Math.pow( 1 + (rate/(100 * n)), n * years);
        result = result * principal;
        result = Math.ceil(result*100)/100;

        System.out.print("$" + principal + " invested at " + rate + "%" + " for " + years + " years compounded " + n + " times per year is ");
        System.out.printf("%.2f.", result);
    }
}