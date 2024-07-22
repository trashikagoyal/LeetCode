class Solution {
    public int strStr(String haystack, String needle) {
        int needP = 0;
        int hayP = 0;
        while (hayP < haystack.length() || (haystack.length() - hayP >= needle.length())){
            needP = 0;
            //int endW = hayP;
            //while(endW < haystack.length() && needP < needle.length() &&   
            //       haystack.charAt(endW) == needle.charAt(needP)){
            while(hayP + needP < haystack.length() && needP < needle.length() &&   
                    haystack.charAt(hayP + needP) == needle.charAt(needP)){
                //endW++;
                needP++;       
            }
            if (needP >= needle.length()){
                return hayP;
            } 
            hayP++;    
        }
        return -1;
    }
}