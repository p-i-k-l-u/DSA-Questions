package String;

public class Reverse_Word_Better_Approach {

    public static void main(String[] args) {

        String str = "I Love Automation";
        StringBuilder res = new StringBuilder();

        // Split by space (not "")
        for (String word : str.split(" ")) {
            res.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Correct print statement
        System.out.println(res.toString().trim());
    }
}