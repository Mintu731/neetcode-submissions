class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        
        for(int i:piles){
            r=Math.max(r,i);
        }
        int ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            int tar=cal(piles,mid);
            if(tar<=h){
                ans=Math.min(ans,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public int cal(int[] piles,int n){
        int an=0;
        for(int i: piles){
            an+=Math.ceil((double)i/n);
        }
        return an;
    }
}
