class Solution {
    public String largestNumber(int[] nums) {
        String num[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(num,(a,b)->(b+a).compareTo(a+b));
        if(num[0].equals("0")){
            return "0";
        }
        String ans="";
        for(String s:num){
            ans+=s;

        }
        return ans;
    }
}