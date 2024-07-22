class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(String s:sentences){
            int c=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    c++;
                }
            }
            c+=1;
            ans=Math.max(c,ans);
        }
        return ans;
    }
}