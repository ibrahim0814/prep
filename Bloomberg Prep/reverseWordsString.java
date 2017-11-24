//Reverse all the words in a given string
/*
For example,
Given s = "the sky is blue",
return "blue is sky the".
*/

//The key to this problem is how you initially process the array and all the random edge cases involved. You can't just split it with spaces, because what if you have multiple spaces? What about spaces at the end of the array that will give you blank values?

//What you need to do is trim() the string first to delete white spaces at the end. Then use split() with a regular expression that deletes all consecutive white spaces in a row

//Then you just go backwards from the end of the array and concatenate. Remember that after you're done, you need to put the first element (which goes at the end) without a space so you need to do that outside the for loop

public String reverseWords(String s) {

        String[] parts = s.trim().split("\\s+");
        String out = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
        }
        return out + parts[0];

}
