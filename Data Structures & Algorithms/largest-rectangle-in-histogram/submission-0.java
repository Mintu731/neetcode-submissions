class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        int[] pse=pse(heights);
        int[] nse=nse(heights);
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<heights.length; i++){
           max= Math.max(max,(nse[i]-pse[i]-1)*heights[i]);
        }
        return max;
    }
    public int[] pse(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            else{
                ans[i]=-1;
            }
           st.push(i);
        }
        return ans;
    }
    public int[] nse(int arr[]){
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            if(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }else{
                ans[i]=arr.length;
            }
            st.push(i);
        }
        return ans;
    }
}
