//Return the max profit we can make from buying and selling a Stock
//Array of numbers represents what the stock is currently selling for
//If we want to maximize the difference between two numbers, as long as we sell after we buy (which means, the figure we sell it for has to come after in the array)

/*

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.

*/

//We basically need to have a running tally of maxProfit and minPrice numbers
//if the current element is greater than out minprice, this means we can sell it for a profit. Then we set our profit by comparing the differece between the current value for the profit we have and the new value. If new value is greater, then that is our new profit
//if the current element is less than our minPrice, set the minPrice to current element

//Pretty straightforward, read the code below

public int maxProfit(int[] prices) {

      int profit = 0;
      if(prices.length >=2){

          //set initial value of minprice
          int minPrice = prices[0];
          for(int i=0; i<prices.length;i++){

              //if curr element is greater we can make a profit
              if(prices[i] > minPrice){
                  //set profit to max between old profit and new profit
                  profit = Math.max(profit, prices[i] - minPrice);
              }else{
                  //else we set the min
                  minPrice = prices[i];
              }
          }
      }
      return profit;
}
