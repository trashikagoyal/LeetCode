class Solution {
    public int[] sortArray(int[] nums) {
       return nums=Merge(nums,0,nums.length-1);
    }
    public int[] Merge(int []arr,int si,int ei) {
		if(si==ei) {
			int []bs=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		int mid=(si+ei)/2;
		int []fa=Merge(arr,si,mid);
		int []sa=Merge(arr,mid+1,ei);
		return MergeTwoArray(fa,sa);
	}
	public int[] MergeTwoArray(int arr1[],int arr2[]) {
		int n=arr1.length;
		int m=arr2.length;
		int ans[]=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n&&j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}