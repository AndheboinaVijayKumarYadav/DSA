package DSA.Practice.ex_10Sep;

public class MoveAllZerosToEnd {
    public static void printArray(int[] Arr){
        int Arr_len = Arr.length;
        for(int i=0;i<Arr_len;i++){
            System.out.println(Arr[i]);
        }

    }
    public static int[] MoveZeros(int[] array){
        int index = 0;
        for(int i = 0;i<array.length;i++){

            if(array[i] != 0){
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
                index++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
            int[] array = {0,1,0,4,12,0,34,56,2,0,23,45,1};
            System.out.println("Moving the Zeros to end of the array");
            MoveZeros(array);
            printArray(array);
    }
}
