package DSA.Practice.ex_14Sep;

import java.util.Scanner;

public class LCM {
    // Least Common Multiple
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int  number1 = input.nextInt();
        System.out.println("Please enter the second number");
        int  number2 = input.nextInt();
        int  max = Math.max(number2,number1);
        int  min = Math.min(number1,number2);
            // Basic solution
        /*
            while(lcm > 0){
                if(lcm % number1 == 0 && lcm % number2 ==0){
                    System.out.println("LCM value is " + lcm);
                    return;
                }
                lcm++;
            }
        */
            int i = 1;
            while(true){
                int lcm = number1 * i;
                if(((min * i) % max) == 0){
                    System.out.println("LCM value is " + lcm);
                    return;
                }
                i++;
            }
    }
}
