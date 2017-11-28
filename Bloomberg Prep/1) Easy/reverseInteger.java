//Problem: reverse a given integer
//pretty simple
//the only tricky part here is accounting for overflow
//the way you do this is by having a double value that you interate with
//then you can cast that double to an int
//

public int reverse(int x) {

        //iterate over double, cast to int
        //for some reason "return (int)fin" doesn't work so you have to set fin1 = (int)fin

        double fin = 0;
        int fin1 = 0;

        while(x!=0){

            //get the last value, add it to current
            int val = x%10;
            fin = (fin*10)+val;
            x = x/10;
        }

        //check for overflow
        if(fin > Integer.MAX_VALUE  || fin < Integer.MIN_VALUE) return 0;
        fin1= (int)fin;
        return fin1;
}
