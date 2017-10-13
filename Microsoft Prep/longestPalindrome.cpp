//passes 89/94 test cases on leetcode
//timeout on some cases, input too big

//done is cpp because you can access chars in string with array notation 

string longestPalindrome(string s) {
        // base can either be 2 letters or 1 letter


        //Steps:
        //1) You know that there are two base case aba where b is the middle or abba where bb is the middle
        //2) iterate over the string two times and set left and right index values for both cases
        //3) You'll have a local variable string that gets the longest string for each iteration of i
        //4) You'll also have a while loop that keeps appending to that as along as right and left index values are valid
        //5) at the end of each for loop, check to see whether the local length is greater than our result string
        //6) if it is greater, set result to local string
        //7) keep in mind that local resets everytime the for loop runs
        //8) also need to have a base case where if length of string ==1, just return the char at 0;

        //this is going to be our final string
        string result ="";

        //base case where len ==1
        if(s.length() ==1){
            return string(1,s[0]);
        }

        //this is for where the base of the palindrome is a single character
        for(int i =0; i<s.length();i++){

            //set l and r to the front and back char values
            int l =i-1;
            int r=i+1;

            //set the local string to the char at i
            string local = string(1,s[i]);

            //while the front and back are the same and there are valid index values, keep going
            while(s[l] == s[r] && l >=0 && r<s.length()){

                //apend the chars to the front and back
                local = s[l]+local+s[r];

                //decrement left and increment right
                l--;
                r++;

                //if the len of local is greater than result, make result = local
                if(local.length()>result.length()){
                    result = local;

                }
            }
        }


        //same thing as above, except this time we initialize local to blank
        //also l is equal to i and r is i+1
        for(int i=0; i<s.length();i++){

            int l=i;
            int r=i+1;

            string local = "";
            while(s[l]==s[r] && l>=0 && r<s.length()){
                local = s[l]+local+s[r];
                l--;
                r++;
                if(local.length()>result.length()){
                    result = local;

                }
            }
        }

        //if we don't get a valid result, just return the first element
        if(result ==""){
            return string(1,s[0]);
        }else{
            //return our string;
            return result;
        }


    }
