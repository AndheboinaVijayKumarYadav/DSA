package DSA.Practice.ex_10Sep;

import java.util.Scanner;

public class EvenOrOddUsingBitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to check whether it is even or odd");
        int userNumber = input.nextInt();
        if((userNumber & 1) == 0){
            System.out.println("The Number you have entered is Even");
        }
        else{
            System.out.println("The Number you have entered is Odd");
        }

        input.close();
    }
}
