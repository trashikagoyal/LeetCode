class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        
        // Step 1: Count the frequency of each number
        for (int n : nums) {
            freq[n]++;
        }
        
        // Step 2: Calculate the prefix sums
        for (int i = 1; i <= 100; i++) {
            freq[i] += freq[i - 1];
        }
        
        // Step 3: Transform the nums array based on the prefix sums
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;
            } else {
                nums[i] = freq[nums[i] - 1];
            }
        }
        
        return nums;
    }
}
