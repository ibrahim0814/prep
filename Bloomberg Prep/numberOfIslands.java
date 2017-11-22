//This is a classic depth first search problem
//Question:

/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3
*/

//Basically what we have to do is loop through each element of the array and figure out whether its a 1 or a 0. If its a 1, then we do a depth first search to figure out how many other 1's are connected to it forming an island. We can only go top, bottom, right, and left NOT horizontally. As soon as we encounter more 1's, we set them to 0 to indidicate that we've already check them.
//Keep in mind that the grid is of type char! This means we check equality via the quotation marks (ie. grid[row][column] == '1')

class Solution {
    public int numIslands(char[][] grid) {

        //figure out if grid is empty, set the row and column values
        int row = grid.length;
        int column;
        if(row != 0){
            column = grid[0].length;
        }else{
            return 0;
        }


        int islands = 0;

        //loop through each element and loop for a 1 we havent found before that is also not connected to another island
        for(int i = 0; i<row; i++){
            for(int j = 0; j<column; j++){

                // as soon as we find a 1, do a dfs and figure out how many other 1's are connected to it. Then, set those 1's to 0
                if(grid[i][j] == '1'){
                    islands++;
                    //conduct depth first search
                    dfs(grid, i, j);

                }
            }
        }

        return islands;

    }

    public void dfs(char[][] grid, int row, int column){

        //check bounds for row and column
        if(row >= 0 && column >= 0 && row < grid.length && column < grid[0].length){

            //if its a 1, then we have 4 other positions we need to Check
            //we also need to set the 1 to 0
            if(grid[row][column] == '1'){

                grid[row][column] = '0';

                //only 4 valid positions where another 1 can be
                dfs(grid,row+1, column);
                dfs(grid, row-1, column);
                dfs(grid,row, column+1);
                dfs(grid,row,column-1);
            }
        }


    }


}
