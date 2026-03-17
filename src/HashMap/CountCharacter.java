package HashMap;

import java.util.HashMap;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "DSA";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
//              map.put(c,map.get(c) + 1);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }else{
                map.put(c,1);
            }
        }
//        System.out.println(map);
        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }


}
