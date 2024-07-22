class Solution {
    public int[] productExceptSelf(int[] nums) {
        boolean containsZero=false;
        int c=0;
        int product=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                containsZero=true;
                c++;
            }
            else{
                product*=nums[i];
            }
        }
        int result[]=new int[n];
        if(c>=2){
            return result;
        }
        for(int i=0;i<n;i++){
            if(containsZero){
                if(nums[i]==0){
                    result[i]=product;
                }
                else{
                    result[i]=0;
                }
            }
            else{
                result[i]=(int)(product/nums[i]);
            }
        }
        return result;
    }
}