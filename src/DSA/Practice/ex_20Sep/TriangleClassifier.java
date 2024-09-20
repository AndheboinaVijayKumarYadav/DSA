package DSA.Practice.ex_20Sep;

public class TriangleClassifier {
    public static void main(String[] args) {
        int a = 50,b = 50,c =50;

        if( a == c && a == b){
            System.out.println("Equilateral triangle");
        }
        else if(a == c || a == b || b == c){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}
