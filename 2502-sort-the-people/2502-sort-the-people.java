class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                if(heights[j] > heights[i]) { // Change the comparison to sort in descending order
                    // Swap heights
                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;
                    
                    // Swap names
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
        return names;
    }
}
