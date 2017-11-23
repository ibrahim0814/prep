//Problem: given a string, either compress it or de compress it
//For compression, you'll have a string like:
//aaabbaacdddd --> a3b2a2cd4

//For decompression, you need to do the exact opposite
//a3b2a2cd4 ----> aaabbaacdddd



//For this method, convert string to char array, loop through
//The logic is pretty straighforward
//Have a running length total
//Have a current char
//As soon as we get a different char, then concatenate the return string with len and previous char
public static String compress(String str){

        String ret = "";

        char[] charArr = str.toCharArray();

        if(charArr.length != 0){

            char curr = charArr[0];
            int len = 1;

            for(int i = 1; i< charArr.length; i++){
                if(charArr[i] == curr){
                    len++;

                    //This is the only tricky part. When we reach the end, it won't concatenate if we don't set up a condition where we check to see if this is the end
                    //Otherwise, pretty straightforward
                    if(i+1 == charArr.length){
                        ret+=curr;
                        if(len > 1){ret+=len;}
                    }
                }else{
                    ret+=curr;
                    if(len > 1){ret+=len;}
                    len = 1;
                    curr = charArr[i];
                }
            }
        }

        return ret;
    }

    //for this method, we need to distinguish between letters and numbers
    //VERY IMPORTANT: Character.isDigit(char c), Character.isLetter(char c)
    //The above functions make this method very short and concise
    public static String decompress(String str){

        String ret = "";
        char[] charArr = str.toCharArray();
        if(str.length() > 0){

            char curr = charArr[0];
            for(int i =1; i<charArr.length; i++){

                //pretty simple, as soon as we encounter a digit, we know we have to concatenate that many copies of the current char to the return string
                if(Character.isDigit(charArr[i])){

                    //subtract '0' to get the number
                    int num = charArr[i]-'0';
                    //for loop add
                    for(int j =0; j<num; j++){ret+=curr;}
                }else{
                    curr = charArr[i];
                    //this is the only tricky part
                    //single letters don't have any numbers attached, so you need to check for if you have 2 consecutive letters
                    //if you do, then you need to concatenate the current char
                    //we have 2 if statements: first checks to see if we're in range, second checks to if its a letter or not
                    if(i+1 < charArr.length){
                        if(Character.isLetter(charArr[i+1])){ret+=curr;}
                    }

                }
            }

        }

        return ret;


    }
