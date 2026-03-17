package String;

public class ReverseString {

    public static void main(String[] args) {
        String str = " Automation";
//        String rev = "";

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(rev);

        // Basic Approach
//        for(int i = str.length()-1;i>=0;i--){
//
//            rev += str.charAt(i);
//        }
//        System.out.println(rev);
    }

}
