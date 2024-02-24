package dataStructure.Array.SquaresofaSortedArray977;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int resFlag = nums.length -1;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[resFlag] = nums[left] * nums[left];
                left++;
            }
            else {
                result[resFlag] = nums[right] * nums[right];
                right--;
            }
            resFlag--;
        }
        return result;
    }
}