class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int cursum=0;
        int freq=0;
        for(int i=0; i<nums.length; i++){
            mp.put(cursum,mp.getOrDefault(cursum,0)+1);
            cursum+=nums[i];
            if(mp.containsKey(cursum-k)){
                freq+=mp.get(cursum-k);
            }

        }
        return freq;
    }
}