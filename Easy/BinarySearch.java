https://leetcode.com/problems/binary-search/description/

import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2; //to avoid integer overflow
            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums = new int[size];
        int target=sc.nextInt();
        for(int i=0; i<size; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(s.search(nums,target));
    }
}
