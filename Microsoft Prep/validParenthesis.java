//pretty self explanatory

//remember that we want to peek and if the peek equals, then we wanna pop

public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        HashMap<Character, Character> vals = new HashMap<>();

        vals.put('}', '{');
        vals.put(')','(');
        vals.put(']','[');

        // ([{}])

        for(int i =0; i<s.length();i++){

            char k = s.charAt(i);

            if(k == '{' || k=='['||k=='('){

                stk.push(k);
            }else{

                if(stk.isEmpty()){
                    return false;
                }

                if(stk.peek() != vals.get(k)){
                    return false;
                }else{
                    stk.pop();
                }
            }

        }

       return stk.isEmpty();


    }
