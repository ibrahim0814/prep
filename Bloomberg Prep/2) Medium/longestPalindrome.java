public String longestPalindrome(String s) {
    //establish start and end indexes for the substring that'll be returned
    int start = 0, end = 0;
    //loop through each character
    for (int i = 0; i < s.length(); i++) {
        //set up cases for if its even and odd

        //base case, 1 letter which we expand around 'aba'
        int len1 = expandAroundCenter(s, i, i);
        //base case, 2 letters which we expand around 'abba'
        int len2 = expandAroundCenter(s, i, i + 1);

        //take which ever one gives you the max element
        int len = Math.max(len1, len2);

        //if len is greater than our current string, then set up new start and end values
        if (len > end - start) {
            //need to back .5 length to get to start
            start = i - (len - 1) / 2;
            //need to go ahead .5 length to get to end
            end = i + len / 2;
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        L--;
        R++;
    }
    return R - L - 1;
}
