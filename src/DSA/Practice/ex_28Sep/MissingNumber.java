package DSA.Practice.ex_28Sep;

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,3,7};
        int n = array.length+1;
        int sum = (n * (n+1))/2;
        int arraySum = 0;
        for (int i = 0; i < array.length ; i++) {
            arraySum += array[i];
        }
        int missingNumber = sum - arraySum;
        System.out.println("Missing Number in array is " + missingNumber);
    }
}
