https://leetcode.com/problems/find-closest-number-to-zero/

class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int closest = nums[0];
        for(int i = 1; i<n; i++){
            int currentAbs = Math.abs(nums[i]);
            int closestAbs = Math.abs(closest);
            if(currentAbs<closestAbs || (currentAbs == closestAbs && nums[i] > closest)){
                closest = nums[i];
            }
        }
        return closest;
    }
}
