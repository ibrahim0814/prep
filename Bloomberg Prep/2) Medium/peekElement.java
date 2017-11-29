//Find the peek element's index in an array where n[i] != n[i+1]

/*
For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
*/

//Basically another application of binary Search
//The trick to this is realizing that if an element is not the peak,then you know that a peak exists to the right if the element on the right is greater and a peak exists on the left if an element on the left is greater

//Do binary search. DO NOT check in the loop to see if an element is the peak element because at the end of the while loop, the starting index IS the index for the peak element. Notice that we set end = mid and start = mid+1. This is because we don't want the loop to continue forever, so we need to increment either the start or the end at some point.


public int findPeakElement(int[] nums) {

    if(nums.length <=1){return 0;}

    int start =0;
    int end = nums.length -1;
    while(start<end){
        int mid = (start+end)/2;
        //if number to the right is smaller, then we know we need to search on the left side to set end = mid
        if (nums[mid]>nums[mid+1]){end = mid;}

        //we know we need to search on right side, to start = mid+1
        else {start = mid+1;}
    }
    //peak element index
    return start;
}
