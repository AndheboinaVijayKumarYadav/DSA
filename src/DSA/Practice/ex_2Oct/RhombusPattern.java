package DSA.Practice.ex_2Oct;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the no of rows");
        int rows = input.nextInt();
        System.out.println("Please enter the no of columns");
        int col = input.nextInt();

        for(int i = 0;i<rows;i++){
            int k = i;
            // to add spaces before printing **
//            while(k > 0){
//                System.out.print(" ");
//                k--;
//            }
            for(int spaceCount = 0;spaceCount<i;spaceCount++){
                System.out.print(" ");
            }
            for(int star = 0;star<col;star++){

                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
