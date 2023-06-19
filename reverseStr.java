
public class reverseStr {
    public static String reveString(String str){
        String result=new String("");
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            result=c+result;
        }
        return result;
    }
    public static void main(String[] args) {
        String s="romil@12345";
        System.out.print(reveString(s));

    }
}
