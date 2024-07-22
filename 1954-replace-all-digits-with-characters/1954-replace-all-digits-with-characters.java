class Solution {
    public String replaceDigits(String s) {
        for(int i=1;i<s.length();i+=2){
            char a=s.charAt(i-1);
            int n=(a+s.charAt(i)-'0');
            System.out.println(n);
            s=s.substring(0,i)+(char)n+s.substring(i+1);
        }
        return s;
    }
}