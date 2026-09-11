class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> st1= new HashSet<>();
         Set<Integer> st2= new HashSet<>();
         for(int i=0; i<nums1.length; i++){
            st1.add(nums1[i]);
         }
           for(int i=0; i<nums2.length; i++){
            st2.add(nums2[i]);
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