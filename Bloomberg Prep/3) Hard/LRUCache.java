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
class LRUCache {

    //current size
    int size = 0;

    //given capacity of the heap
    int cap;


    //should really implement this yourself
    LinkedList<Integer> list = new LinkedList<>();

    //this should really be Integer, Node where node is a pointer
    HashMap<Integer,Integer> map = new HashMap<>();


    //constructor
    public LRUCache(int capacity) {
        cap = capacity;
    }

    //retrives user defined value for key, -1 if it doesn't exist
    public int get(int key) {

        //remove from curr position, add to end
        if(map.containsKey(key)){

            Object keyObj = (Integer) key;
            //notice that the line below is in O(n) time!
            list.remove(keyObj);
            list.addLast(key);
            return map.get(key);

        }else{
            return -1;
        }

    }

    public void put(int key, int value) {

        if(size == cap && !map.containsKey(key)){

            //remove least recently used item which is at front, add provided element to the end
            //this way we maintain our size
            int tempKey = list.removeFirst();
            map.remove(tempKey);
            list.addLast(key);
            map.put(key,value);
        }else if(size != cap && !map.containsKey(key)){

            //if the element is not in our list and we still have space, add to end
            list.addLast(key);
            map.put(key,value);
            size++;
        }else{

            //element already exists, but we want to put it at the end because it is the most recently used one and update its value
            Object keyObj = (Integer) key;

            //still O(n) time, slowing the program down
            list.remove(keyObj);
            list.addLast(key);
            map.put(key,value);
        }

    }
}
