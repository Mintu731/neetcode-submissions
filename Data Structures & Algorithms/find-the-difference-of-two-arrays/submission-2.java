class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> st1= new HashSet<>();
         Set<Integer> st2= new HashSet<>();
         for(int n:nums1){
            st1.add(n);
         }
           for(int n : nums2){
            st2.add(n);
         }
         List<Integer> li1=new ArrayList<>();
  for(int n:st1){
    if(!st2.contains(n)){
        li1.add(n);
    }
  }
  List<Integer> li2=new ArrayList<>();
    for(int n :st2){
        if(! st1.contains(n)){
            li2.add(n);
        }
    }

         

     return Arrays.asList(li1, li2);
    }
}