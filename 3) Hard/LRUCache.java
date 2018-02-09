//The main principal behind this is that we have a linkedlist of the most recently used objects that is capped by a capacity
//Everytime we insert a new element, we need to check whether or not its in the list (linked list). If its not in the list, then add it to the back (or front, really doesn't matter as long as you know which end of the list represents the least recently used item). If it is in the list, then we remove it from its current position and add it to the back where the most recently used item is.
//How do we do this?
//Use a custom data structure with a doubly linked list and a hashmap(key, pointer to object in linked list)
//In the example below, I did not do this because I didn't want to implement a doubly linked list, so I just used the STL LinkedList in Java
//Note that the wierd object syntax is to convert the int to an object so that the .remove(Object n) doesn't get confused witht the .remove(int n) methods

/*
Example:

LRUCache cache = new LRUCache( 2  capacity );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
*/


//The only downside to this implementation is that deletion is O(n) becuase the STL linkedlist has to search for the object everytime. Everything else is O(1)
//Passed all the tests in leetcode, timeout exception on the last one
//Keep track of the STL methods!

public class DNode {
    DNode prev;
    DNode next;
    int key;
    int val;
    DNode(){
        key = 0;
        val = 0;
    }
    DNode(int k, int v){
        key = k;
        val = v;
    }
}

//important to note that the node before the tail is the most recently used
//node after the head is the least recently used
public class LRUCache {

    //need a hashmap, head and tail pointers, as well as size and capacity
    HashMap<Integer, DNode> map;
    DNode head;
    DNode tail;
    int capacity;
    int size;

    //make sure to initailize prev and next pointers for *both* head and tail
    LRUCache(int cap){
        head = new DNode();
        tail = new DNode();
        head.prev = tail;
        head.next = tail;
        tail.next = head;
        tail.prev = head;
        map = new HashMap<>();
        size = 0;
        capacity = cap;
    }

    //retiries the value for a node by first obtaining the node via the map, and then getting the key
    //make sure you update it so that its at the tail, where we keep the most recently used element
    public int get(int key){
        if(!map.containsKey(key)) return -1;
        update(map.get(key));
        return map.get(key).val;
    }

    //put or update the value of a particular key, val combination
    // only place where we delete nodes from map
    // only place where we incremement and decrement size
    public void put(int key, int val){

        if(!map.containsKey(key)){
            DNode node = new DNode(key, val);
            map.put(key, node);
            add(node);
            size++;
        }else{
            map.get(key).val = val;
            update(map.get(key));
        }
        if(size > capacity){
            map.remove(head.next.key);
            remove(head.next);
            size--;
        }
    }

    //remove the node and then add it again so that its now the most recently used node
    public void update(DNode node){
        remove(node);
        add(node);
    }

    public void add(DNode node){
        tail.prev.next = node;
        node.next = tail;
        node.prev = tail.prev;
        tail.prev = node;
    }

    public void remove(DNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
