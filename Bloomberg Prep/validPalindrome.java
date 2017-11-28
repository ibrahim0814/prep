//Determine if a string of words is a palindrome
//You have to make sure you're only considering alphanumeric characters
//You also need to ignore case

//Take notice of the Character method!!

public boolean isPalindrome(String s) {
    String ret = "";
    for(int i =0; i<s.length();i++){
        //notice the isLetter or Digit method
        if(Character.isLetterOrDigit(s.charAt(i))){
            ret+=s.charAt(i);
        }
    }

    //check to see if its a palindrome by using pointers from beginning and end and working our way towards the middle
    int ptr1 = 0;
    int ptr2 = ret.length()-1;
    while(ptr1<=ptr2){
        //toLowerCase method!
        if(Character.toLowerCase(ret.charAt(ptr1)) != Character.toLowerCase(ret.charAt(ptr2)) ){
            return false;
        }
        ptr1++;
        ptr2--;
    }
    return true;
}
