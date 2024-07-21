package Test;

import java.util.*;

public class Test {

    
    public static void main(String[] args) {

        /* 
        HashMap<String,List<String>> hashMap=new HashMap<>();
        List<String> l1=new ArrayList<>();
        l1.add("1");
        hashMap.put("123",Arrays.asList("aa","bb"));
        hashMap.put("456",Arrays.asList("cc","dd"));
        hashMap.put("xyz",l1);

        for(String key:hashMap.keySet()){
            System.out.println(key);
            List<String> curList=hashMap.get(key);
            System.out.println(curList);
        }

        Deque<Integer> dQueue=new ArrayDeque<>();
        dQueue.peekLast();

       /*
        -------
        for(Map.Entry<String,List<String>> cur:hashMap.entrySet()){
            System.out.println(cur.getKey());
           for(String st:cur.getValue()){
                System.out.println(st);
           }
           --  for(String st:hashMap.get(cur.getKey())){
           --     System.out.println(st);
           --}
        }
        -----

        */
        
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1, "one");
        //System.out.println(hm.get(1));
        hm.put(1, "two");
        //System.out.println(hm.get(1));
        hm.remove(1);
        //System.out.println(hm.get(1));
        
        Comparator<Integer> comp1=(i,j)-> i<j?1:-1;
        TreeMap<Integer,String> tm=new TreeMap<>(comp1);
        tm.put(2, "two");
        tm.put(1, "one");
        //System.out.println(tm);

        List<Integer> l1=new ArrayList<>();
        l1.add(11);
        l1.add(1);
        l1.add(9);
        Comparator<Integer> comp=(i,j)-> i<j?1:-1;
        Collections.sort(l1,comp);
        //System.out.println(l1);

        Comparator<Integer> comp2=(i,j)->i<j?1:-1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(comp2);
        pq.add(11);
        pq.add(1);
        pq.add(9);
        //System.out.println(pq);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.remove(1);
       // System.out.println(hs.contains(2));

        TreeSet<Integer> ts=new TreeSet<>(comp2);
        ts.add(2);
        ts.add(1);
       // System.out.println(ts);

       Queue<Integer> q=new LinkedList<>();
       q.add(2);
       q.add(1);
       System.out.println(q);
       System.out.println(q.peek());
       System.out.println(q.poll());
       System.out.println(q);
       

    }
    

}
