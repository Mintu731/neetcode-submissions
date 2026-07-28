class Solution {
    public int trap(int[] height) {
        int mcap=0;
        for(int i=1; i<height.length-1; i++){
            int min=Math.min(lmax(i-1,height),rmax(i+1,height));
            if(min<=height[i])continue;
            else{
                mcap=mcap+(min-height[i]);
            }
        }
        return mcap;
    }
    public int lmax(int l,int[] arr){
        int max=0;
        while(l>=0){
            max=Math.max(max,arr[l]);
            l--;
        }
        return max;
    }

    public int rmax(int r,int[] arr){
        int rmax=0;
        while(r<arr.length){
            rmax=Math.max(rmax,arr[r]);
            r++;
        }
        return rmax;
    }
   
}
