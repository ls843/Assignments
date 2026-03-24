public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSum(nums, k));
    }

    public static int maxSum(int[] nums, int k) {
        if(nums.length < k) return -1; 

        int windowSum = 0;
        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;
        int idx = 0;

        for(int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[idx++] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}