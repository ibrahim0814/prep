public static int[] twoSum(int [] a, int target){

  HashMap<Integer, Integer> map = new HashMap<>();

  for(int i=0; i<a.length; i++){

    int compliment = target - a[i];
    if(map.containsKey(compliment)){
      return new int[] {i, map.get(compliment)};
    } else{
      map.put(a[i], i);
    }
  }
  return new int[] {};
}
