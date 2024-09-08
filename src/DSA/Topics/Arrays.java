package DSA.Topics;

public class Arrays {
    public static void printArray(int[] Arr){
        int Arr_len = Arr.length;
        for(int i=0;i<Arr_len;i++){
            System.out.println(Arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1]= 2;
        myArray[2]= 3;
        myArray[3]= 4;
        myArray[4]= 5;
        myArray[3]= 10;
        myArray[4]= 40;

        // Creating the object from the class Arrays so that we can use its methods
        Arrays newArray = new Arrays();
        newArray.printArray(myArray);

    }
}
