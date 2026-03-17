package String;

public class RemoveSpace {
    public static void main(String[] args) {

//        String str = " I LOVE DSA";
//        String res = str.replace(" ","");
//
//        System.out.println(res);

        String str = "DSA Lover ";
        StringBuilder res = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != ' '){
                res.append(c);
            }
        }
        System.out.println(res);





    }
}
