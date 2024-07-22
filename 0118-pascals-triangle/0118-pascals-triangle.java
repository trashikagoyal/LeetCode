class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>  ans=new ArrayList<>();
       int row = 0;
		int star = 1;
		while (row < numRows) {
            List<Integer> ll=new ArrayList<>();
			int i = 0;
			int val = 1;
			while (i < star) {
                ll.add(val);
				val = ((row - i) * val) / (i + 1);
				i++;
			}
			star++;
			ans.add(ll);
			row++;

		} 
        return ans;
    }
}