public static boolean isBalanced(String expression) {

        Stack<Character> charStk = new Stack<Character>();
        HashMap<Character, Character> icons = new HashMap<Character, Character>();

        icons.put('}','{');
        icons.put(']','[');
        icons.put(')','(');

        char[] expCharArr = expression.toCharArray();


        for(int i =0; i<expCharArr.length;i++){

            if(expCharArr[i] == '{' || expCharArr[i] == '[' || expCharArr[i] == '('){

                charStk.push(expCharArr[i]);
            } else{

                if(charStk.empty()){

                    return false;
                }
                
                if(icons.get(expCharArr[i]) == charStk.peek()){

                    charStk.pop();
                } else{

                    return false;
                }
            }
        }

        if(!charStk.empty()){

            return false;
        }

        return true;




    }
