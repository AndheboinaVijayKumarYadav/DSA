package DSA.Practice.ex_1Nov;

public class MoveHashToFront {
    public static void main(String[] args) {
        System.out.println(moveHashToFront("Vijay#Kumar#Yadav"));
    }
    public static String moveHashToFront(String str){
        StringBuilder hash = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (c == '#') {
                hash.append('#');
            } else {
                sb.append(c);
            }
        }

        return hash.toString()+sb.toString();
    }
}
