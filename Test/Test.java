package Test;

import java.util.*;

public class Test {

    
    public static void main(String[] args) {

        //-----------
        HashMap<String,List<String>> hashMap=new HashMap<>();
        hashMap.put("123",Arrays.asList("aa","bb"));
        hashMap.put("456",Arrays.asList("cc","dd"));

        for(Map.Entry<String,List<String>> cur:hashMap.entrySet()){
            System.out.println(cur.getKey());
           for(String st:cur.getValue()){
                System.out.println(st);
           }
           /*  for(String st:hashMap.get(cur.getKey())){
                System.out.println(st);
            }*/
        }

        //-----------

    }
    

}
