package DSA.Practice.ex_22Sep;

import java.util.Scanner;

public class DeletingElementFromArray {
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

        System.out.println("Please enter the element who want to delete from array");
        int element = input.nextInt();
        int noOfOcc = noOfOccurrences(array,element);
        int[] newArray = deletingElementfromArray(array,element,noOfOcc);

        System.out.println("New Array after deleting the given element is ");
        for(int i = 0 ;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

    public static int[] deletingElementfromArray(int[] array, int element, int occ){
        int[] newArray = new int[array.length - occ];
        int j =0;
        for(int i = 0;i<array.length;i++){
            if(array[i] != element){
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
    public static int noOfOccurrences(int[] array, int element){
        int occ = 0;
        for(int i =0;i<array.length;i++){
            if(array[i] == element){
                occ++;
            }
        }
        return occ;
    }
}
