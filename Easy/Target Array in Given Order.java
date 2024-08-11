// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.*;
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        // Adding elements to new array
        for(int i=0; i<nums.length; i++){
            target.add(index[i], nums[i]);
        }
        int[] result = new int[target.size()];
        // Converting ArrayList to integer Array
        for(int i=0;i<target.size();i++){
            result[i]=target.get(i);
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        for(int i = 0; i<size; i++){
            nums[i]=sc.nextInt();
            index[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.createTargetArray(nums,index)));
    }
}
