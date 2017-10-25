//Steps
//1) Set up prev and next pointer
//2) Set up a HashSet so that you can check if elements are duplicated
//3) Do the logic for it on paper, you'll get it.
//4) You either need to remove from end or remove from the middle
//5) Draw it out, it will make sense

Node RemoveDuplicates(Node head) {

    //curr and prev pointers along with HashSet
    Node curr = head;
    Node prev = null;
    HashSet<Integer> set = new HashSet<>();

    //while curr is not null keep going
    while(curr != null){

        // if the set contains the data there are two possibliities
        // either curr.next is null or not
        if(set.contains(curr.data)){

            //we always wanna set prev.next to curr.next
            prev.next = curr.next;

            //if curr.next is null, we can just break, bc we've reached the end
            if(curr.next == null){
                break;
            }else{

                //however if its not, we don't wanna touch our prev
                // just set curr to curr.next and move on
                curr = curr.next;
            }

        }else{

            // if value is not in our hashset then we can just set prev to curr and curr to curr.next;
            set.add(curr.data);
            prev = curr;
            curr = curr.next;
        }



    }

    return head;



}
