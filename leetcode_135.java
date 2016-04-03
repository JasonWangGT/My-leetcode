public class Solution {
    public int findMin(int[] nums) {
        if(nums==null || nums.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int target = nums[end];     //compare with the last number in the array, not the first
        while(start + 1 < end){
            int middle = start + (end - start)/2;
            if(nums[middle] < target){
                end = middle;
            }
            else{
                start = middle;
            }
        }
        
        if (nums[start] <= nums[end]){
            return nums[start];
        }
        else{
            return nums[end];
        }
    }
}