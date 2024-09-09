class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ll=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
         boolean board[]=new boolean[n];
		Permutation(board,k,0,n,0,ll,ans);
        return ans;
    }
    public static void Permutation(boolean [] board,int tq,int qpsf, int n,int idx,List<Integer> ll,List<List<Integer>> ans) {//qpsf =queen placed so far
		if(qpsf==tq) {
			// System.out.println(ans);
            ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for(int i=idx;i<n;i++)
		{
			if(board[i]==false) {
				board[i]=true;//change in arguments
                ll.add(i+1);
				Permutation(board,tq,qpsf+1,n,i+1,ll,ans);
                ll.remove(ll.size()-1);
				board[i]=false;//backtracking undo
			}
		}
	}
}