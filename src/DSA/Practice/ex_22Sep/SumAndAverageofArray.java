package DSA.Practice.ex_22Sep;

public class SumAndAverageofArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int sizeOfArray = 5;
        int sumOfArray = sum(array,sizeOfArray);
        float averageOfArray = (float) sumOfArray/sizeOfArray;
        System.out.printf("Sum of the Array is %d \n",sumOfArray);
        System.out.printf("Average of Array is %.2f", averageOfArray);


    }

    public static int sum(int[] arr, int sizeOfArray){
        int sum = 0;

        for(int i = 0;i<sizeOfArray;i++){
            sum += arr[i];
        }
        return sum;
    }
}
