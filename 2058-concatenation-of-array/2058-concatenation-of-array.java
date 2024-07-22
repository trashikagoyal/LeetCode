class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int i=0;
        int ans[]=new int[2*n];
        while(i<n){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            i++;
        }
        return ans;
    }
}