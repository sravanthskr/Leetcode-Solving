# https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

# Optimised
import java.util.*;
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i : nums){
            if(((int)(Math.log10(i))+1) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.findNumbers(nums));
    }
}


# Unoptimised
  String str = Integer.toString(value);
            if(str.length()%2 == 0)
