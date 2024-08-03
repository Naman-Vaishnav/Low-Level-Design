package Problems.LRUCache;


import java.util.HashMap;
import java.util.Map;

public class LRUCache<K,V> {
    Map<K,Node<K,V>> hashTable;
    DoubleLikedList<K,V> dll;
    int capacity;

    LRUCache(int capacity){
        this.capacity=capacity;
        hashTable=new HashMap<>();
        dll=new DoubleLikedList<>();
    }

    public synchronized V get(K key){
        Node<K,V> node=hashTable.get(key);
        if(node!=null){
            dll.removeNode(node);
            dll.addToHead(node);
            return node.value;
        }
        return null;
    }

    public synchronized void put(K key,V value){
        Node<K,V> node=hashTable.get(key);
        if(node!=null){
            dll.removeNode(node);
            node.value=value;
            dll.addToHead(node);
        }
        else{
            if(hashTable.size()>=capacity){
                Node<K,V> tail=dll.getTailNode();
                dll.removeNode(tail);
                hashTable.remove(tail.key);
            }
            Node<K,V> newNode=new Node<>(key,value);
            hashTable.put(key, newNode);
            dll.addToHead(newNode);
        }
    }

}
