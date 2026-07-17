class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      HashSet<List<Integer>> set=new HashSet<>();
      for(int i=0; i<nums.length; i++){
        HashSet<Integer> s1=new HashSet<>();
        for(int j=i+1; j<nums.length; j++){
            int tar=-(nums[i]+nums[j]);
            if(s1.contains(tar)){
                List<Integer> li=Arrays.asList(nums[i],nums[j],tar);
                Collections.sort(li);
                set.add(li);
            }
            s1.add(nums[j]);
        }
      }
      return new ArrayList(set);
    }
}
