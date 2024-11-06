package DSA.Practice.ex_5thNov;

public class NoOfBorrowOperations {
    public static void main(String[] args) {
        int number1 = 465;
        int number2 = 309;
        String result = noOfBorrowOperations(number1,number2);
        System.out.println(result);

    }

    public static String noOfBorrowOperations(int number1, int number2){
        int temp1 = 0;
        int temp2 = 0;
        int borrow = 0;

        if(number1 < number2){
            return "Not Possible";
        }
        else if(number1 == number2){
            return Integer.toString(0);
        }

        while(number1 > 0 && number2 > 0){
             temp1 = number1 % 10;
             temp2 = number2 % 10;
             if(temp1 < temp2){
                 borrow++;
                 number1 = (number1/10) - 1;
             }
             else{
                 number1 = number1/10;
             }
             number2 = number2/10;
        }

        return Integer.toString(borrow);
    }
}
