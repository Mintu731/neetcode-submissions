class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int p=nums.length-1;
        int l=0,r=p;
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
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