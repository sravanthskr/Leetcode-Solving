https://leetcode.com/problems/alternating-digit-sum/

import java.util.*;
class Solution {
    public int alternateDigitSum(int n) {
        String numStr = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum -= digit;
            }
        }
        
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int n = sc.nextInt();
        System.out.println(s.alternateDigitSum(n));
    }
}
