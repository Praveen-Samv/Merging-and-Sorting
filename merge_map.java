package Collections.Map_Interface.Hash_Map;

import java.util.*;

public class merge_map {
    public static void main(String[] args) {

        HashMap<String,Integer> x1 = new HashMap<>();
        x1.put("a",1);
        x1.put("b",2);
        x1.put("c",3);
        HashMap<String,Integer> x2 = new HashMap<>();
        x2.put("aa",11);
        x2.put("bb",12);
        x2.put("cc",13);
        HashMap<String,Integer> x3 = new HashMap<>();
        x3.putAll(x1);
        x3.putAll(x2);
        System.out.println(x3);


        List<String> x4 = x3.keySet().stream().sorted().toList();
        List<Integer> x5 = x3.values().stream().sorted().toList();
        System.out.println(x4);
        System.out.println(x5);

        Map<String,Integer> x6 = new LinkedHashMap<>();
        for (int i = 0 ; i <= 5 ; i++){
            x6.put(x4.get(i),x5.get(i));
        }
        System.out.println(x6);




    }
}
