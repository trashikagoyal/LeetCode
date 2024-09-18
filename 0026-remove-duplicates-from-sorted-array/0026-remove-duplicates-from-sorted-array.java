class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, k = 1;
        int n = nums.length;
        while(i<n){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}