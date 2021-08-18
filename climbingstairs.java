/*

Complexity Analysis

Time complexity : O(n)O(n). Single loop upto nn is required to calculate n^{th}n 
th
  fibonacci number.

Space complexity : O(1)O(1). Constant space is used.


You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/


class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        
        int fir = 1;
        int sec= 2;
        for(int i=3;i<=n;i++){
        int third=fir+sec;
            fir=sec;
            sec=third;
        
        }
        return sec;
    }
}
