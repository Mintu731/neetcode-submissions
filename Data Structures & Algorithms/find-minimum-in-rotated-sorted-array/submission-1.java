class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int s=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            s=Math.min(s,nums[mid]);
            if(nums[mid]<nums[r]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return s;
    }
}
