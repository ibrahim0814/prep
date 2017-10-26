//Check to see if two linked lists are equal
//we have to check both of their values and their length
//if one of them is null from the start, then return 0 for false
//continue to loop while not both are null
//check values
//increment both head pointers
//this way we continue to go through till 1 after the length of the shortest one
//in our while loop if one of them nodes is null, and one is not we can immediately return

int CompareLists(Node headA, Node headB) {


    if(headA == null || headB == null){

        return 0;
    }else{


        while(headA != null || headB != null ){


            if(headA != null && headB != null){

                if(headA.data != headB.data){
                    return 0;
                    
                }

                headA = headA.next;
                headB = headB.next;


            }else{

                return 0;

            }
        }

    }

    return 1;

}
