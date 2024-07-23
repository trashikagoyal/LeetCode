class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
           map.put(n,map.getOrDefault(n, 0)+1);
        }
        List<Integer> elements = new ArrayList<>();
        for (int n : nums) {
            elements.add(n);
        }
        Collections.sort(elements, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return b - a; 
            }
            return freqA - freqB;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = elements.get(i);
        }

        return nums;
    }
}