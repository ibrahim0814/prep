
//Steps
//1) if the haystack equals the needle return 0
//2) make substrings from i to i+needle length
//3) check to see if the strings are equal
//if they are, return i
//important thing to note here are the for loop bounds and the .equals() method for string!

public int strStr(String haystack, String needle) {

        if(haystack.equals(needle)){
            return 0;
        }

        for(int i =0; i<haystack.length()-needle.length()+1; i++){

            String sub = haystack.substring(i,i+needle.length());
            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;

    }
