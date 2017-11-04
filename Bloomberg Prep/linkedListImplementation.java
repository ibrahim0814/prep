//Linked list implementation from scratch in Java
//methods: get(index), add(index), add(), remove(index)
//for this particular implementation, we have a dummy node as the head
//first node is at head.next
//couple of things to remember:
//look at how we throw exceptions in Java
//also be sure to increment size in add at index
//make sure you also put a class defined for the Node!

public class Node{
  int val;
  Node next;
  Node(int x) {val = x;}
}

//code below was tested in IntelliJ

public class LinkedList{

    private Node head;
    private int size;

    LinkedList(){
        head = new Node(0);
        size = 0;
    }

    public int get(int index) throws IndexOutOfBoundsException{

        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node copy = head.next;
        while(index >0  && copy != null){
            copy = copy.next;
            index--;
        }
        return copy.val;
    }

    public void add(int val){

        Node copy = head;
        while(copy.next != null){
            copy = copy.next;
        }
        copy.next = new Node(val);
        size++;

    }

    public void add (int index, int val) throws IndexOutOfBoundsException{

        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }else if(index == size){
            add(val);
        }else{

            Node prev = head;
            Node curr = head.next;

            for(int i=0; i<index;i++){
                prev = curr;
                curr = curr.next;
            }

            prev.next = new Node(val);
            prev.next.next = curr;
            size++;
        }
    }

    public void remove(int index) throws IndexOutOfBoundsException{

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        Node prev = head;
        Node curr = head.next;

        for(int i =0; i<index; i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        size--;

    }

    public int getSize(){
        return size;
    }

    public void print(){
        Node copy = head.next;
        while(copy != null){
            System.out.print(copy.val+" ");
            copy = copy.next;
        }
        System.out.println();
    }
}
