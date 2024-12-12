//https://leetcode.com/problems/fibonacci-number/

import java.util.*;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        
        int a = 0, b = 1, f = 0;
        for (int i = 2; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Solution solution = new Solution();
        int result = solution.fib(n); // Call the fib method
        System.out.println(result);
    }
}
