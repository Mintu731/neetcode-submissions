class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> mp =new HashMap<>();
        int freq=0,cursum=0;
        for(int n: nums){
            mp.put(cursum,mp.getOrDefault(cursum,0)+1);
            cursum+=n;
            freq+=mp.getOrDefault(cursum-goal,0);

        }
        return freq;
            }
}