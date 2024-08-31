package Test;

import java.util.*;

 class Test1 {

    
    public static void main(String[] args) {

       
        HashMap<String,List<String>> hashMap=new HashMap<>();
        List<String> l1=new ArrayList<>();
        l1.add("1");
        hashMap.put("123",Arrays.asList("aa","bb"));
        hashMap.put("456",Arrays.asList("cc","dd"));
        hashMap.put("xyz",l1);
        hashMap.containsKey("1");
       
 /* 
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
        tm.containsKey(1);
        //System.out.println(tm);

        List<Integer> l11=new ArrayList<>();
        l11.add(11);
        l11.add(1);
        l11.add(9);
        Comparator<Integer> comp=(i,j)-> i<j?1:-1;
        Collections.sort(l11,comp);
        
        //System.out.println(l1);

        Comparator<Integer> comp2=(i,j)->i<j?1:-1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(comp2); //max 
        pq.add(11);
        pq.add(1);
        pq.add(9);
        //System.out.println(pq);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.remove(1);
        hs.contains(2);
       // System.out.println(hs.contains(2));

        TreeSet<Integer> ts=new TreeSet<>(comp2);
        ts.add(2);
        ts.add(1);
        ts.last();
        ts.first();
        ts.remove(1);
       // System.out.println(ts);

       Queue<Integer> q=new LinkedList<>();
       q.add(2);
       q.add(1);
       q.poll();
       q.peek();
       //System.out.println(q);
       //System.out.println(q.peek());
      // System.out.println(q.poll());
       //System.out.println(q);

       LinkedList<Integer> ll=new LinkedList<>();
       ll.getLast();
       ll.getFirst();
       ll.addFirst(1);
       ll.addLast(1);
       ll.removeFirst();
       ll.removeLast();

       StringBuilder sb=new StringBuilder("abcd");
       //sb.equals(sb);
       sb.substring(0, 1);
       sb.append("ABC");
       sb.deleteCharAt(0);
       sb.delete(0, 2);
       sb.setCharAt(0,sb.charAt(1) );
       sb.charAt(0);
       //sb.insert(0, 0)
       //sb.
       //System.out.println(sb);

       int[] ar=new int[3];
       ar[0]=0;ar[1]=1;ar[2]=2;
     // List<Integer> l1=(Arrays.asList(ar));
      // Collections.reverse(Arrays.asList(ar));
       //for(int x:l1)System.out.println(ar.length);

       String s1="a";
       StringBuilder sb1=new StringBuilder();
       sb1.append(s1);
       
       //System.out.println(s1+'b');
       //System.out.println(s1);

       TreeSet<Integer> ts1=new TreeSet<>();
       ts1.add(2);
       ts1.add(1);
       ts1.add(4);
       ts1.add(5);
       /*
       System.out.println(ts1.higher(4)); //5 >4
       System.out.println(ts1.lower(4)); //2  <4
       System.out.println(ts1.ceiling(4));//4 >=4
       System.out.println(ts1.floor(4)); //4  <=4
       System.out.println(ts1.ceiling(3));//4 >=4
       System.out.println(ts1.floor(3)); //2  <=4
        */

       TreeMap<Integer,String> tm1=new TreeMap<>();
       tm1.put(1, "one");
       tm1.put(2, "two");
       tm1.put(5, "five");
       tm1.put(4, "four");
       tm1.firstKey();
       tm1.lastKey();
      /*  System.out.println(tm1.higherKey(4));//5
       System.out.println(tm1.lowerKey(4));//2
       System.out.println(tm1.ceilingKey(4));//4
       System.out.println(tm1.floorKey(4));//4
       System.out.println(tm1.ceilingKey(3));//4
       System.out.println(tm1.floorKey(3));//2
       System.out.println(tm1.higherKey(5)); //null
*/
Date d=new Date();
//System.out.println(d.getTime());

ArrayDeque<Integer> dq=new ArrayDeque<>();

       

    }
    

}
