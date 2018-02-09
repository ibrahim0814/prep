//Classic dynamic programming problem

//recursive approach
public int climbStairs(int steps) {
  int total = 0;
  return climbStairsRecur(steps,total);
}
public int climbStairsRecur(int steps, int total){
  if(total > steps){return 0;}
  if(total == steps){return 1;}
  return climbStairsRecur(steps,total+1) + climbStairsRecur(steps,total+2);
}


//Iterative approach
//The thing to notice here is that this is a fibonacci sequence
//We only need to store the last 2 elements (if we can jump 1 or 2 steps)
public int climbStairs(int steps) {

    //probably might wanna check for bad inputs here

    //i forgot to check for 1
    if (steps == 1) {
        return 1;
    }
    int first = 1;
    int second = 2;
    for (int i = 3; i <= steps; i++) {
        int third = first + second;
        first = second;
        second = third;
    }
    return second;
}
