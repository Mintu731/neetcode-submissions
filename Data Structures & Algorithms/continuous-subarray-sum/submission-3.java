class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>(); 
        int cursum=0;
        mp.put(0,-1);
        for(int i=0; i<nums.length; i++){
         cursum+=nums[i];
         var rem=cursum%k;
         if(mp.containsKey(rem)){
            if(i - mp.get(rem)>=2){
                return true;
            }
         }else{
         mp.put(rem,i);
         }
        }
        System.out.println(mp);
       return false; 
    }
}