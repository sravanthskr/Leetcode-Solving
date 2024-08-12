// https://leetcode.com/problems/shuffle-the-array/

import java.util.*;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i=0, j=n, k=0; i<n; i++, j++, k+=2){
            result[k]=nums[i];
            result[k+1]=nums[j];
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int n = sc.nextInt();
        for(int i=0; i<size;i++){
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.shuffle(nums, n)));
    }
}

