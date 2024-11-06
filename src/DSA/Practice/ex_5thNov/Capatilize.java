package DSA.Practice.ex_5thNov;

public class Capatilize {
    public static void main(String[] args) {
        String result = capitilize("heLLo WorLd",11,'l');
        System.out.println(result);
    }

    public static String capitilize(String str,int length,char c){
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i)  == Character.toLowerCase(c)){
                    str1.append(Character.toUpperCase(str.charAt(i)));
                }
                else if(str.charAt(i) == Character.toUpperCase(c)) {
                    str1.append(Character.toLowerCase(str.charAt(i)));
                }
                else{
                    str1.append(str.charAt(i));
                }
        }
        return str1.toString();
    }
}
