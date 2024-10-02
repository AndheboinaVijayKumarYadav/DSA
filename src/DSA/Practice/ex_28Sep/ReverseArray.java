package DSA.Practice.ex_28Sep;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(array, 0, array.length - 1);
        System.out.println("Array after reverse:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void reverseArray(int[] array, int low, int high) {
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}
