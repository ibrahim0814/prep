//[3,2,1,5,6,2,9,10]


void nextGreatest(int[] arr){

  if(arr.length == 0){return;}
  Stack<Integer> stk = new Stack<>();
  for(int i=0; i<arr.length;i++){

    if(stk.isEmpty()){stk.push(arr[i]);}
    else{

      if(arr[i]<stk.peek()){stk.push(arr[i]);}
      else{
        int currElem = arr[i];
        while(currElem > stk.peek() && !stk.isEmpty()){
          int top = stk.pop();
          System.out.println(top+" --> "currElem);
        }
        stk.push(currElem);
      }
    }
  }
}
