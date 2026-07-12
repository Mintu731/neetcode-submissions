class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre1=new int[nums.length];
        int[] pre2=new int[nums.length];
        pre2[pre2.length -1]=1;
        pre1[0]=1;
        for(int i=1,j=nums.length-2; i<nums.length &&j>=0; i++,j--){
            pre1[i]=pre1[i-1]*nums[i-1];
            pre2[j]=pre2[j+1]*nums[j+1];
        }
        for(int i=0; i<nums.length; i++){
            pre1[i]=pre1[i]*pre2[i];
        }
        return pre1;
    }
}  
