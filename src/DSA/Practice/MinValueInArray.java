package DSA.Practice;

public class MinValueInArray {
    public static int MinValue(int[] array){
        int minValue = array[0];
        for(int i =1;i<array.length;i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        int[] array = {5,9,3,15,1,2,0,-1};
        System.out.println(MinValue(array));

    }
}
