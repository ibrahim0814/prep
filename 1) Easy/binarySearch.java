//Implementation of binary search
//Pretty straightforward
//Three pointers -- start, end and mid
//while loop, as long as start is less than or equal to end continue
//adjust end or start depending on whether the target is below or higher than mid
//return false if the while loop doesn't find anything

public boolean BinarySearch(int[] arr, int target){

  int start = 0;
  int end = arr.length;
  int mid = (start+end)/2;

  while(start<=end){
    if(arr[mid] == target){
      return true;
    }
    if(arr[mid] > target){
      end = mid-1;
    }
    if(arr[mid] < target){
      start = mid+1;
    }
    mid = (start+end)/2;
  }

  return false;
}
