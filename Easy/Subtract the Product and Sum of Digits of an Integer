// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

import java.util.*;
class Solution {
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int a=n%10;
            sum += a;
            product *=a;
            n=n/10;
        }
        return product-sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(subtractProductAndSum(input));
    }
}
