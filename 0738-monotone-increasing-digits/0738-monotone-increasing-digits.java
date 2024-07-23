class Solution {
    public int monotoneIncreasingDigits(int n) {
        int c = 0;
        int d1 = -1, d2=-1;
        int ans = n;
        while(n>0){
            c++;
            d1 = n%10;
            n = n/10;
            d2 = n%10;
            if(d2>d1){
                ans = (n-1)*(int)Math.pow(10,c)+ ((int)Math.pow(10,c)-1);
                n =ans ;
                c = 0;
            }
        }
        return ans;
    }
}