# https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int extraCandies = sc.nextInt();
        int size = sc.nextInt();
        int[] candies = new int[size];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }
    
        Solution s = new Solution();
        List<Boolean> result = s.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
