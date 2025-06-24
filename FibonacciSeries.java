package Practice;

// To print the Fabonacci Series upto a certain number

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.print("Here is the Fabonacci Series");
        printFibonacciSeries(num);
    }

    public static void printFibonacciSeries(int num) {
        if (num < 0)
            return;
        System.out.print("0");
        if (num == 0)
            return;
        System.out.print("1");
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
