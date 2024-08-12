// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/


// Optimised
import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] f = new int[101];

        // Count the frequencies of each number
        for (int num : nums) {
            f[num]++;
        }

        // Calculate the cumulative sum
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            int temp = f[i];
            f[i] = sum;
            sum += temp;
        }

        // Generate the result array using the cumulative sum array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = f[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int size = sc.nextInt();
        int[] nums = new int[size];

        // Read the elements of the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an instance of Solution and call the method
        Solution s = new Solution();
        int[] result = s.smallerNumbersThanCurrent(nums);

        // Print the result array
        System.out.println(Arrays.toString(result));
    }
}


// Unoptimmised
import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j= 0; j<nums.length; j++){
                if(i==j){
                    continue;
                }    
                else if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(nums)));
    }
}
