package DSA.Practice.ex_14Sep;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int number){
        if(number < 0){
            System.out.println("Entered Number is not a valid number");
            return 0;
        }
        if(number < 2){
           return 1;
        }
        long factorialValue = 1L;

        while (number > 0){
            System.out.println(factorialValue);
            factorialValue = number * factorialValue;
            number --;
        }
        return  factorialValue;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number for Factorial calculation");
        int  number = input.nextInt();
        long factorialValue = factorial(number);
        System.out.println(factorialValue);
        if(factorialValue > 0){
            System.out.printf("Factorial of %d is %d",number,factorialValue);
        }

    }
}
