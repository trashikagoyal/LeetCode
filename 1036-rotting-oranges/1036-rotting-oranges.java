class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        int max=0;
        int rr[]={-1,1,0,0};
        int cc[]={0,0,1,-1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int t=p.time;
            max=Math.max(max,t);
            for(int i=0;i<4;i++){
                int newrow=r+rr[i];
                int newcol=c+cc[i];
                if(newrow>=0&&newrow<m&&newcol>=0&&newcol<n&&vis[newrow][newcol]==0&&grid[newrow][newcol]==1){
                    vis[newrow][newcol]=2;
                    q.add(new Pair(newrow,newcol,t+1));
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && vis[i][j] != 2) {
                    return -1;
                }
            }
        }
        return max;
    }
}
class Pair{
    int row;
    int col;
    int time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}