package Problems.LRUCache;

public class DoubleLikedList<K,V> {
    Node<K,V> head;
    Node<K,V> tail;

    DoubleLikedList(){
        head=new Node<>(null,null);
        tail=new Node<>(null,null);
        head.next=tail;
        tail.prev=head;
    }

    void addToHead(Node<K,V> node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    void removeNode(Node<K,V> node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    Node<K,V> getTailNode(){
        return tail.prev;
    }

    void removeTailNode(){
        removeNode(tail.prev);
    }

}
