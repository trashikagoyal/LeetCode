class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char a : s.toCharArray()) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        if(map.size()==1){
            return true;
        }
        int f=map.get(s.charAt(0));
        for(char a:map.keySet()){
            if(f!=map.get(a)){
                return false;
            }
        }
        return true;
    }
}