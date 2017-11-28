//So for this, use Kadane's algorithm
//Basically we have a max and a local max
//Keep adding numbers to the local max from the array
//Assign localMax to max if its greater - makes sense
//TRICKY PART: set localMax to zero if it dips below 0
//At this point, the array is less than zero, which is not what we want
//Thats it! No triple for loops

public int maxSubArray(int[] nums) {

      int max = Integer.MIN_VALUE;
      int localMax = 0;

      if(nums.length > 0){
          for(int i =0; i<nums.length; i++){
              localMax+=nums[i];

              //determine max between global max and local max
              max = Math.max(localMax,max);

              //determine is localMax has dipped below zero
              localMax = Math.max(localMax,0);
          }
          return max;
      }else{
          return 0;
      }
}
