//Given an array where each element represents the maximum number of jumps you can take to reach the next element, determine if its possible to get to the end

/*
Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

*/

//The trick to this problem is realizing that we only have issues when there are elements that equal 0
//In this case, we need the previous element to have enough numbers to make up for the zero

//What we do is we loop through from the end
//As soon as we encounter a zero, set up a while loop to check whether current element has the number of jumps needed to get to the next non zero element
//keep increasing the number of jumps needed if it doesnt and keep decrementing the index
//if at any point, the index is below zero, that means we've reached the end of the array and there is no possible route to get to the end
public boolean canJump(int[] nums) {

        //preliminary checks, false if array is empty. true is arr is 1 element
        if(nums.length == 0) return false;
        if(nums.length ==1) return true;

        //loop through from the end
        for(int i= nums.length -2; i>=0; i--){

            //as soon as we encounter a zero, set up while loop
            if(nums[i] == 0){
                //if we hit a zero, the minium we need to get across is 2 jumps
                //we start at 1 -- i don't get why, but whatever
                //increase the number of jumps everytime we don't have enough
                //also decrement the index
                //if index <0 then there is no hope, return false
                int jumpsNeeded = 1;
                while(jumpsNeeded > nums[i]){
                    jumpsNeeded++;
                    i--;
                    if(i<0) return false;
                }
            }
        }
        return true;

    }
