# https://leetcode.com/problems/palindrome-number/solutions/

import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int num = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int rem = x%10;
            x = x/10;
            sum = sum * 10 + rem;
        }
        if(num==sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(s.isPalindrome(x));
    }
}


# Not Optimised
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String reverse = "";
        for(int i=0;i<num.length();i++){
            reverse = num.charAt(i)+reverse;
        }
        if(num.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(s.isPalindrome(x));
    }
}
