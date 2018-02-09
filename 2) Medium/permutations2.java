//Our goal is to give all possible permuatations and avoid duplicates

//Steps
//1) we need a boolean array to keep track of whether we've used the number at a specific index -- initally this is set to false
//2) we also need to sort the array because then we can check if adjacent elements are the same and skip them
//3) since this is a recusive problem we need a separate fuction that actually takes in our boolean array as a paramter
//4) within our separate method, first we check to see if the temp list is the same size as our num, if it is then we put it into the results array
//5) now we loop thorugh all the elements
//6) first we check whether or not we've used it , if we have continue
//7) now we check if the adjacent element is the same, if i>0, and if that adjacent element was not used --- if all are true, then continue
//8) easy part - now just add the element, mark it used, do recursive step, mark it unused and pop it out of of our temp

public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return results;
        }
        //boiler plate set up temp, boolean array, sort the array and pass it in
        List<Integer> temp = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        Arrays.sort(nums);
        permutation(temp, nums, results, bool);
        return results;

    }

    public static void permutation (List<Integer> temp, int[] nums, List<List<Integer>> results, boolean[] bool){

        if(temp.size()== nums.length){
            results.add(new ArrayList<>(temp));

        }else{
            for(int i=0; i< nums.length;i++){

                //check whether we've used this element already
                if(bool[i]) continue;
                //check whether this element is the same as adjacent element
                if(i>0 && nums[i-1]== nums[i] && !bool[i-1]) continue;

                temp.add(nums[i]);
                bool[i]=true;
                permutation(temp,nums,results, bool);
                bool[i]=false;
                temp.remove(temp.size()-1);


            }
        }
    }
