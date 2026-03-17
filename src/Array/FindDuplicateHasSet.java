package Array;

import java.util.HashSet;

public class FindDuplicateHasSet {

    public static void main(String[] args) {
        int [] arr = {1,2,4,39,5,4,3};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}
