package DSA.Practice;

public class SecondMaxValueinArray {
    public static int secondMax(int[] array){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 2;i<array.length;i++){
            if(array[i] > max1){
                max2 = max1;
                max1 = array[i];
            }
            else if(max2 < array[i] && array[i] != max1){
                max2 = array[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int[] array = {12,33,2,33,33,1,32};
        System.out.println(secondMax(array));
    }
}
