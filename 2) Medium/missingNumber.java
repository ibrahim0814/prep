//Find the missing number in an array that ranges from 0 to n
//For this problem, we know that the sum of a series of numbers of length n that ranges from 1 to n is n(n+1)/2
//Don't get confused about the fact that in this problem we start for 0 to n instead of 1 to n, its the same formula, no need to change it.

//Insert length into the formula to get the "true" sum or what it should actually be. Then subtract that by going through the array to find the actual sum

public int missingNumber(int[] nums) {
    int n = nums.length;
    //"true" sum
    int trueSum = (n*(n+1))/2;
    int actualSum = 0;

    //actual sum
    for(int i=0; i<nums.length;i++){
        actualSum+=nums[i];
    }

    //value that's missing is the difference between true and actual
    return trueSum-actualSum;


}
