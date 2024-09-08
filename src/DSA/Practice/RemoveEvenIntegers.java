package DSA.Practice;

public class RemoveEvenIntegers {
    public static int[] removeIntegers(int[] array) {
        int oddCount = 0;
        for (int i=0;i<array.length;i++){
            if(array[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] resultArray = new int[oddCount];
        int index = 0;

        for (int i=0;i<array.length;i++){
            if(array[i] % 2 != 0){
                resultArray[index++] = array[i];
            }
        }

        return resultArray;

    }
    public static void printArray(int[] Arr){
        int Arr_len = Arr.length;
        for(int i=0;i<Arr_len;i++){
            System.out.println(Arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,7,10,6,5};
        int[] result = removeIntegers(arr);

        printArray(result);

    }
}
