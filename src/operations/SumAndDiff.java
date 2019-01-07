package operations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumAndDiff {
    public static void main(String[] args) {


        int num1, num2, sum, diff;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        num1 = sc.nextInt();
        System.out.println("Enter a second number");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of two number is =" + sum);
        diff = num1 - num2;
        System.out.println("Subtraction of two number is =" + diff);
    }
}