package DSA.Practice.ex_22Sep;

import java.util.Scanner;

public class NoOfOccurencesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of Array");
        int sizeOfArray = input.nextInt();
        // checking the size of array from user
        if(sizeOfArray <=0){
            System.out.println("Please enter valid number. Array size cannot be zero or negative");
        }
        int[] array = new int[sizeOfArray];
        for(int i = 0;i<sizeOfArray;i++){
            System.out.println("Please enter the element no "+ (i+1)+" :");
            array[i] = input.nextInt();
        }

        System.out.println("Please enter the element for which you want the no of Occurences in array");
        int element = input.nextInt();
        int noOfOccurence = noOfOccurences(array,element);
        System.out.printf("No of Occurences of element %d is %d",element,noOfOccurence);
    }

    public static int noOfOccurences(int[] array, int element){
        int count = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == element){
                count++;
            }
        }
        return count;
    }
}
