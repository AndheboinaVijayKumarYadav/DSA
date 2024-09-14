package DSA.Practice.ex_14Sep;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int  number1 = input.nextInt();
        System.out.println("Please enter the second number");
        int  number2 = input.nextInt();
        int gcdValue = gcd(number1, number2);
        System.out.println("GCD value is "+ gcdValue);
    }
    public static int gcd(int number1, int number2){
        int gcd = 1;
        int i = 2;
        int min = Math.min(number1,number2);

        while(i <= min){
            if(number1 % i == 0  && number2 % i ==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
}
