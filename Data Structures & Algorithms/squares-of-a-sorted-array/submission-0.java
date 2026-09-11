class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int p=nums.length-1;
        int l=0,r=p;
        while(l<=r){
            int ls=(int)Math.pow(nums[l],2);
            int rs=(int)Math.pow(nums[r],2);
            if(rs>ls){
                ans[p--]=rs;
                r--;
            }else{
                ans[p--]=ls;
                l++;
            }
        }
        return ans;
        
    }
}