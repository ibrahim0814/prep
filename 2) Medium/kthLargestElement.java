//This problem asks you to find the kth largest element in an array
//Its kind  of bs because the actual solution is a convoluted version of quicksort which I really don't want to try and figure out, so I'll leave the 2nd best and 3rd best solutions to below

//The first is to simply sort the array and then random access the kth element
//Complexity is O(nlogn) because Arrays.sort() uses merge sort
public int findKthLargest(int[] nums, int k) {
   Arrays.sort(nums);
   return nums[nums.length -k];
}

//The other way to do it is via a priority queue
//Complexity is O(n^2) worst case because the linked list is being modified everytime you put in another element
//PAY ATTENTION TO HOW A PRIORITY QUEUE IS DECLARED!
public int findKthLargest(int[] nums, int k) {

    PriorityQueue<Integer> queue = new PriorityQueue<>();

    for(int i=0; i<nums.length; i++){
        queue.add(nums[i]);
    }
    for(int i=0; i<nums.length-k;i++){
        queue.poll();
    }

    return queue.poll();

}
