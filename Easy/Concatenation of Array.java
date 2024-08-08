https://leetcode.com/problems/concatenation-of-array/
import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nums_size=sc.nextInt();
        int[] nums=new int[nums_size];
        for(int i=0; i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        Solution conc = new Solution();
        System.out.println(Arrays.toString(conc.getConcatenation(nums)));
    }
}
