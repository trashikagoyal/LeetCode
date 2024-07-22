class Solution {
    public List<String> printVertically(String str) {
        String s[] = str.split(" ");
        List<String> ans = new ArrayList<>();
        int max = 0;
        
        for (String w : s) {
            max = Math.max(w.length(), max);
        }
        
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String w : s) {
                if (w.length() < i + 1) {
                    sb.append(' ');
                } else {
                    sb.append(w.charAt(i));
                }
            }
            ans.add(sb.toString().replaceFirst("\\s++$", ""));
        }
        
        return ans;
    }
}