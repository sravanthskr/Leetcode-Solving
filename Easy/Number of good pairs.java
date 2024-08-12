// https://leetcode.com/problems/number-of-good-pairs/

import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){ // j=i+1 because the previous was already compared
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println((s.numIdenticalPairs(nums)));
    }
}
