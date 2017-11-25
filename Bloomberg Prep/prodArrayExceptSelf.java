//Problem is to return an array where each element is the product of everything else in the array except for itself

//The trick to this problem is going through the array from the left and them again from the right, keeping track of the cumulative sum
/*
For example, given [1,2,3,4], return [24,12,8,6].
*/

// left | 1 2 3 4 | right
//        1 1 1 1

//In the diagram above, when we're going through from the left, we ignore the first element and in fin[1] we insert the product of left (which is initially 1) and the first element of our given array.

//Remember that since we don't do anything to the first element, we need to set it to zero

//Now we pass it from the right we fill fin[length-2] (second to last element) with the product of itself, right (initially 1), and the last element in the given array. Keep doing this until we reach the last element of the final array

//Now we're done!
public int[] productExceptSelf(int[] nums) {

    int[] fin = new int[nums.length];
    if(nums.length == 0){return fin;}

    //running totals of multiples from each direction
    int right = 1;
    int left = 1;

    fin[0]=1;
    //end at nums.length-1 because we're acceessing i+1 for fin (our final arr)
    for(int i =0;i<nums.length-1; i++){
        left = nums[i]*left;
        fin[i+1]= left;
    }

    //this time we multiply whatever we had in teh array with the running right multiple and current element of nums(the given array)
    for(int i= nums.length-1; i>0;i--){
        right*=nums[i];
        fin[i-1]*=right;
    }
    return fin;

}
