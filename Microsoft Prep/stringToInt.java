public int myAtoi(String str) {

      //Steps:
      //1) Trim and remove whitespace
      //2) Check if string is not null
      //3) Check to see if there is a + or - sign, change start index accordingly and set negative value
      //4) loop through and compile number: result *10 + val <--- this works also initiate result to double
      //5) if there is a nonascii character, break
      //6) check if result is greater than or less than interger max, min <-- return accordingly
      //7) return result with (int) typecast

      //important thing to note is that if we encounter a non-ascii character, we need to break out of our loop and return

      //remove whitespace
      str = str.trim();

      //return 0 is string is null or non existant
     if(str == null || str.length()==0){
         return 0;
     }

      //neg startindex and result variable
      int neg =1;
      int startIndex = 0;
      double result =0;

      //if beginning is neg or positive increment start index set neg value
      if(str.charAt(0)=='-' || str.charAt(0)=='+'){
          startIndex++;
          if(str.charAt(0)=='-'){
              neg =-1;
          }
      }

      // loop through the whole thing, compile result
      for(int i = startIndex; i<str.length();i++){

          if(str.charAt(i) < '0' || str.charAt(i) >'9'){
              break;
          }

          int val = (int)str.charAt(i)-'0';

          result = result *10 +val;

      }

      //set neg
      if(neg ==-1){
          result*=-1;
      }

      //see if its in the bounds
      if(result> Integer.MAX_VALUE){
          return Integer.MAX_VALUE;
      }else if(result < Integer.MIN_VALUE){
          return Integer.MIN_VALUE;
      }

      return (int)result;
  


  }
