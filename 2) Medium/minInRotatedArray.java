//Have to find the minimum value in a rotated array

/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

//This problem is whack
//Write it out on a piece of paper
//Modified version of binary search that I don't really get
//The bad way to do this is O(n) time, which is of course going to work
//This approach is O(logn) time which is better 

public int findMin(int[] nums) {

        if(nums.length ==0){return 0;}
        if(nums.length == 1){return nums[0];}

        int start =0, end = nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){start=mid+1;}
            else{end=mid;}
        }
        return nums[start];
}
