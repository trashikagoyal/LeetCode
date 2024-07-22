class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int c=0;
        while(mainTank>=5){
            c+=5;
            mainTank-=5;
            if(additionalTank>0){
                additionalTank--;
                mainTank++;
            }
        }
        c+=mainTank;
        return c*10;
    }
}