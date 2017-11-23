//Print out elements of a matrix in spiral order

//Top is initially 0, bottom is # of rows, left is initially 0, right is # cols

//This problem is interesting. Basically we have 4 index pointers:
//Top, bottom, left, and right
//As long as top<=bottom and left<=right, we continue to loop
//First we go along the top row from top to right, increment top
//Then we go from top to bottom on the rightmost column, decrement right
//Then we go from right to left on the bottom row, decrement bottom
//Then we go from bottom to top on leftmost column, increment left

/*
For example,
Given the following matrix:

[
 top------------->[ 1, 2, 3 ],
                  [ 4, 5, 6 ],
bottom,and left-->[ 7, 8, 9 ]<---right
]

You should return [1,2,3,6,9,8,7,4,5].
*/

public List<Integer> spiralOrder(int[][] matrix) {

        //set initial values for top and bottom.
        //since we know that bottom will give us whether or not array is empty we can check it in the if statement below
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> fin = new ArrayList<>();

        //check is matrix is empty (+1 because we subtracted 1 before to get index)
        if(bottom+1>0){

            //set initial values for left,right, and direction
            int left = 0;
            int right = matrix[0].length-1;
            int direction = 0;

            //continue to loop as long as top<=bottom and left<=right
            while(top<=bottom && left<=right){

              //initial direction is top to right
              //make sure i is <= or >= !!
              //you can figure out the rest
              if(direction ==0){
                  for(int i = top; i<=right; i++){
                    fin.add(matrix[top][i]);
                  }
                  top++;
                  direction = 1;
              }else if(direction == 1){
                  for(int i =top ; i<=bottom; i++ ){
                    fin.add(matrix[i][right]);
                  }
                  right--;
                  direction = 2;
              }else if(direction ==2){
                  for(int i = right; i>=left; i--){
                    fin.add(matrix[bottom][i]);
                  }
                  bottom--;
                  direction = 3;
              }else if(direction == 3){
                  for(int i=bottom; i>=top; i--){
                    fin.add(matrix[i][left]);
                  }
                  left++;
                  direction = 0;
              }

            }

        }

        return fin;


    }
