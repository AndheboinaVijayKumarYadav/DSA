package DSA.Practice.ex_10Sep;

import java.util.Scanner;

public class ResizeArray {
    // Creating a method which resizes the array which takes array and capacity as input
    public static int[] resizeArray(int[] arr, int Capacity){
        // Declaring a new array with given capacity
        int[] resizedArray = new int[Capacity];

        // here we are assigning the values of given array to new array
        for(int i = 0;i<arr.length;i++){
            resizedArray[i] = arr[i];
        }
        // here we are assigning the old array the address of resized array
        // arr = resizedArray;
        return resizedArray;
    }
    public static void main(String[] args) {

        int[] array = new int[10];
        System.out.println("Current length of the array is "+ array.length);

        // Creating a Scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a new value to which you want the size of array should be");

        // reading the New Array size
        int newArraySize = input.nextInt();
        if(newArraySize <= 0){
            System.out.println("Array size should be greater than 0");
            return;
        }

        // Resizing the array
        // ResizeArray object = new ResizeArray();
        int[] newArray = ResizeArray.resizeArray(array,newArraySize);
        System.out.println("Size of Array is increased to "+ newArray.length);

        //closing the scanner
        input.close();

    }
}
