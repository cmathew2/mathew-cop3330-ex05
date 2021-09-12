/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package Base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input
        System.out.print("What is the first number? ");
        String num1 = in.nextLine();
        System.out.print("What is the second number? ");
        String num2 = in.nextLine();

        //num converter
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        //math processes
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        //output with line breaks
        System.out.println(a + " + " + b + " = " + add + "\n" + a + " - " + b + " = " + sub + "\n" + a + " * " + b + " = " + mul + "\n" + a + " / " + b + " = " + div);

    }
}
