//Steps
//1)Basically we set up an external index and a for loop
//2) until nums at the external index equals nums in the for loop keep going and do nothing
//3) at the point it does not equal we increment our index and put the for loop value there
//our return is just index+1 because we only incremented that when we had unique values

public int removeDuplicates(int[] nums) {

        //basically, we only do stuff index when we know we've reached the end of the duplicates
        //then we increment out index and set the value of what we were looking at to that
        //return is index +1 because we started with zero based index and need to add 1

        if (nums.length ==0 ) {
            return 0;
        }
        int index = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[index]){
                index++;
                nums[index] = nums[j];
            }
        }

        return index+1;









    }
