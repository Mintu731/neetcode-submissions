class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(new String(s1).equals(new String(s2))){return true;}
        return false;
    }
}
