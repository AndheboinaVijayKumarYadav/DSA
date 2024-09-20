package DSA.Practice.ex_20Sep;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20 , c = 45;
        int max1 = (a > b)? a: b;
        int max = max1 > c ? max1: c;
        System.out.println(max);
        // better way is
        // max = a > b ? ( a > c ? a: c)); (b > c: b: c);
        // above line is better readability
    }
}
