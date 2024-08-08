// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public static int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        if(nums.length>0){
            result[0]=nums[0];
        }
        for(int i=1; i<nums.length;i++){
            result[i]=result[i-1]+nums[i];
        }
        return result;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i=0; i<array.length; i++){
            array[i]=input.nextInt();
        }
        int[] result = runningSum(array);
        System.out.println(Arrays.toString(result));
    }
}
