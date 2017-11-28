//Merge two sorted lists given that the first array has enough slots to fill in the second array numbers
//No duplicates
//The trick to this is to start from the end and work your way backwards
//Compare the last two valid elements of the two arrays and insert the larger one onto the end of the first array (remember, this has all the extra slots)

/*
Array 1: [4,5,6,0,0,0]<---important! notice the zeros at the end! enough space 
Array 2: [1,2,3]
Final array: [1,2,3,4,5,6]
*/

//n is the smaller array we're copying elements from
//therefore, it makes sense that once we run out of elements that we need to add from end, our method is done
public void merge(int[] numsM, int m, int[] numsN, int n) {
    //three pointers
    //One at end of array we wanna insert elements into
    //One at the end of last valid element in numsM
    //One at the end of last valid element in numsN
    int insertAt = nums1.length-1;
    int nIndex = n-1;
    int mIndex = m-1;

    while(nIndex>=0 ){
        //we have to make sure that mIndex is valid. This only happens when all the elments of the first array are bigger!
        //We know that nIndex is valid at this point because of the while loop condition
        if(mIndex>=0){
            if(numsM[mIndex]>numsN[nIndex]){
                //which ever element we insert, make sure to decrement pointer
                numsM[insertAt] = numsM[mIndex];
                mIndex--;
            }else{
                numsM[insertAt] = numsN[nIndex];
                nIndex--;
            }
        }else{
            //at this point, we've run out of numsM elements, so we just have to insert numsN elements
            numsM[insertAt] = numsN[nIndex];
            nlast--;
        }

        //insert pointer always gets decremented
        insert--;
    }
}
