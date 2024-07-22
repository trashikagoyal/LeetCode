class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(nums[i]>nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        for(int i=1;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(nums[i]<nums[j]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
        }
        return nums;
    }
}