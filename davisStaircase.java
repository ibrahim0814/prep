//brute force recursive solutions
//not time efficient


// problem is that we need to find methods to get up a n step staricase with either 1 or 2 or 3 steps at a time. any combination of those that gets us to the top counts
public static int findSolution(int n, int total){

        if(total >n){
            return 0;
        }



        if(total +1 == n || total +2 ==n || total+3 ==n){

            return 1 + findSolution(n,total+1) + findSolution(n,total+2) + findSolution(n, total+3);

        }


        return findSolution(n,total+1) + findSolution(n,total+2) + findSolution(n, total+3);
    }


// better solution
public static int calcNum(int n) {
        int[] array = new int[n];
        if (n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else if(n == 3) {
            return 4;
        }
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        for (int i = 3; i < n; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }
        return array[array.length-1];
    }
