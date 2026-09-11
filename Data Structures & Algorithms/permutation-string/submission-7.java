class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] st1=new int[26];
        int[] st2=new int[26];
        for(int i=0; i<s1.length(); i++){
            st1[s1.charAt(i)- 'a']++;
            st2[s2.charAt(i)- 'a']++;

        }
         if(Arrays.equals(st1,st2)){return true;}
      for(int i=s1.length(); i<s2.length(); i++){
        st2[s2.charAt(i-s1.length()) - 'a']--;
        st2[s2.charAt(i) - 'a']++;


        if(Arrays.equals(st1,st2)){return true;}
        
      }
        return false;
    }
}
