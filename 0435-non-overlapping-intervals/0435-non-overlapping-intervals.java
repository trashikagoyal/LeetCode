class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, (b, a) -> b[1] - a[1]);
      int goal=0;
      int n=intervals.length;
      for(int i=1;i<n;i++){
          if(intervals[i][0]<intervals[i-1][1]){
            intervals[i][1]=intervals[i-1][1];
            goal++;
        }
      }

      return goal;
    }
}