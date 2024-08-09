# https://leetcode.com/problems/build-array-from-permutation/

import java.util.*;
class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums=new int[size];
        for(int i=0; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
