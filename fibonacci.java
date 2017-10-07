//Steps
//1) this is a recusive problem
//2) base cases are 1 and 0. in those cases just return 1 or 0
//3) recurse through with fibonacci(n-1) and fibonacci(n-2). this is because the next term is the sum of the two previous terms

public static int fibonacci(int n) {

        //establish base cases
        if(n==1){
            return 1;
        } else if(n==0){
            return 0;
        }

        //recursive line
        return fibonacci(n-1) + fibonacci(n-2);
    }
