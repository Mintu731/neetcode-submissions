class Solution {
    public int maxArea(int[] heights) {
        int i=0,j= heights.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
          int t=0;
          if(heights[i] < heights[j]){
            t=heights[i]*(j-i);
            i++;
          }
          else{
            t=heights[j]*(j-i);
            j--;
          }
          max=Math.max(max,t);
        }
        return max;
    }
}
