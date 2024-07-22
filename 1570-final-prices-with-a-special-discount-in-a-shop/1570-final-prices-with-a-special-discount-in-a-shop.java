class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int result[]=new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[st.peek()]>prices[i]){
                    st.pop();
            } 
            if(!st.isEmpty()){ 
                if(prices[i]>prices[st.peek()]){
                    result[i]=prices[i]-prices[st.peek()];
                } 
            }
            else{
                result[i]=prices[i];
            }
            st.push(i);
        }
        return result;
    }
}