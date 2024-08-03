package Problems.LRUCache;

public class Client {
    public static void main(String[] args) {
        LRUCache<Integer,String> cache=new LRUCache<>(3);
        cache.put(1, "one");//1
        cache.put(2, "two");//2 1
        cache.put(3, "three");//3 2 1
        
        System.out.println(cache.get(1));//1 3 2

        cache.put(4, "four");//4 1 3
        System.out.println(cache.get(3));// 3 4 1

        cache.put(5, "five");//5 3 4
        System.out.println(cache.get(1));




    }
}
