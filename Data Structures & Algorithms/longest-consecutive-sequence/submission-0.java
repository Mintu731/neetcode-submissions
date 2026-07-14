class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> st=new HashSet<>();
        for(int n: nums){
            st.add(n);
        }
        for(Integer n:st){
            if(!st.contains(n-1)){
                max=Math.max(max,count(n,st));
            }
        }
        return max;
    }
    public int count(int n,Set<Integer> st){
        int count=1;
        while(st.contains(++n)){count++;}
        return count;
    }
}
