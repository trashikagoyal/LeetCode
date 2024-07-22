class Solution {
    public int passThePillow(int n, int time) {
        int i=1;
        int d=1;
        while(time>=1){
            i+=d;
            System.out.println(i+" "+time);
            if(n==i){
                i=n;
                d=-1;
            }
            if(i==1){
                d=1;
            }
            time--;
        }
        return i;
    }
}