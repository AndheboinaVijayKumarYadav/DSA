package DSA.Practice;

public class ReverseArray {
    public static void printArray(int[] Arr) {
        int Arr_len = Arr.length;
        for (int i = 0; i < Arr_len; i++) {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] Reverse(int[] array){
        int arrayLength = array.length;
        int[] reverseArray = new int[arrayLength];

        for(int i = arrayLength-1;i>=0;i--){
            reverseArray[arrayLength-1-i] = array[i];
        }

        return reverseArray;
    }

    public static int[] ReverseWithWhile(int[] array,int start,int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;

    }
    public static void main(String[] args) {
            int[] array = {2,11,5,10,7,8};
            System.out.println("With Naive Solution");
            int[] reverseArray = Reverse(array);
            printArray(reverseArray);
            System.out.println("With Effective Solution");
            int[] reverseArray2 = ReverseWithWhile(array,0,array.length-1);
            printArray(reverseArray2);

        }

}
