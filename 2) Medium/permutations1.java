//Steps
//1) this is a recursive problem
//2) what you need to do is setup a temp list within the main permute method
//3) now we need to create a separate method that takes in the temp, nums, and the results arraylist
//4) within the separate method, we first check to see if the len of temp is equal to the len of nums (this is the original array) -- if it is, then we know we've gathered all the elements and we can add it to results
//5) if its not equal, we need to add more elements
//6) now we loop through all the elements in nums and check to see if that element is already there
// 7) if its not, then we add it, and continue with the recursive step (passing in all the same parameters)
//8) at the end, we remove the last element (which is the same as the one we added before the recursive step) in order to backtrack

public List<List<Integer>> permute(int[] nums) {

        //our final results arraylist
        List<List<Integer>> results = new ArrayList<>();

        //boiler plate checks to see if nums is empty
        if( nums == null || nums.length == 0){
            return results;
        }

        //this is our temp array
        List<Integer> temp = new ArrayList<>();

        //pass all the stuff including our temp array list to separate method
        permutations(temp, nums, results);
        return results;

    }

    public static void permutations(List<Integer> temp, int nums[] ,List<List<Integer>> results ){

        //first check to see if size is the same as nums, if it is then add
        if(temp.size() == nums.length){
            results.add(new ArrayList<>(temp));
        }else{

            //loop through all the elements of nums
            for(int i=0; i<nums.length; i++){

                //since they're all unique, we can safely check to see if it exist in our temp
                if(!temp.contains(nums[i])){
                    // if it doesnt, then add, recusrive step, and remove from size()-1
                    temp.add(nums[i]);
                    permutations(temp, nums, results);
                    temp.remove(temp.size()-1);
                }
            }
        }


    }
