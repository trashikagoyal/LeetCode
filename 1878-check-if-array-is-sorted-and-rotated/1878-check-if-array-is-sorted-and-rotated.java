class Solution {
    public boolean check(int[] nums) {
        int c=0; //to check the break point jaha se rotate hui
        //kyuki ek hi esa point hoga jaha se sorted m nums[i]>nums[i+1] hpga
        //par agr ek se zyada h toh wo rotation nhi h sorted ka
        if(nums[0]<nums[nums.length-1]){
            c++;
        } 
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
            if(c>1){
                return false;
            }
        }
        return true;
    }
}