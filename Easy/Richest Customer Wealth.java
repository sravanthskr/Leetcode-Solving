// https://leetcode.com/problems/richest-customer-wealth/

import java.util.*;
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i =0; i<accounts.length; i++){
            int sum = 0;
          // accounts[i].length takes column
            for(int j=0; j<accounts[i].length; j++){
                sum = accounts[i][j] + sum;
            }
          // checking greater of each customer [rows]
            if (sum>max){
                max = sum;
            }
        }
      // returning integer
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] accounts = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.maximumWealth(accounts));
    }
}
