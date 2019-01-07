package operations;

import java.util.Scanner;

public class AddTwoNum {
    public void SumOfTwo(int num1,int num2){
        int sum;
        sum = num1+num2;
        System.out.println("Sum of two number is =" +sum);

    }
    public void SubOfTwo(int num1,int num2){
        int diff;
        diff = num1-num2;
        System.out.println("Subtraction of two number is =" +diff);

    }

    public static void main(String[] args) {

        int n1, n2;
        AddTwoNum x = new AddTwoNum();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a first number");
        n1 = in.nextInt();
        System.out.println("Enter a second number");
        n2 = in.nextInt();
        in.close();
        x.SumOfTwo(n1, n2);
        x.SubOfTwo(n1, n2);

    }
}
