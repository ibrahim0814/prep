//we wanna find a sum for three numbers that = 0

//Steps
//1) Sort the given array
//2) Loop through until length-3(inclusive)
//3) Establish start and end points at i+1 and length-1
//4) figure out if starting, ending, and i equal zero
//5) if so, do a while loop to figure out the next valid start and end indexes
//6) if the value is less than zero then increment start (don't really need to validate)
//7) else decrement end

//Other notes: initialize lists like this - List<Integer> n = new ArrayList<>();
public List<List<Integer>> threeSum(int[] nums) {


    //our resulting array list
    List<List<Integer>> fin = new ArrayList<>();

    //sort the nums array
    Arrays.sort(nums);

    //{-1,-1,-1,0,0,1,3}
    //  ^       ^     ^

    //loop through until len-3 (because your start and end pointers will take care of the other indicies )
    for(int i=0;i<=nums.length-3;i++){

        //if our current index is zero and the number before is less than the number after continue
        if(i ==0 || nums[i]> nums[i-1]){

            //establish start and end indexes
            int start = i+1;
            int end = nums.length-1;

            //while start is less than end continue
            while(start < end ){

                //three cases, either they're all equal to zero, less than zero, or greater than zero

                //equal to zero case, basically make a list and add it to the result
                //we also need to find new valid start and end index values while start<end
                if(nums[i]+nums[start]+nums[end] ==0){
                    List<Integer> n = new ArrayList<>();
                    n.add(nums[i]);
                    n.add(nums[start]);
                    n.add(nums[end]);
                    fin.add(n);

                    int currVal = start;
                    while(nums[start] == nums[currVal] && start <end){
                        start++;
                    }
                    int currVal1 = end;
                    while(nums[end] == nums[currVal1] && start <end){
                        end--;
                    }

                 //if less than zero increment start
                }else if(nums[i]+nums[start]+nums[end] <0 ){

                    start++;

                 //greater than zero decrement end
                }else{

                    end--;

                }
            }


        }


    }

    //return final
    return fin;
}
