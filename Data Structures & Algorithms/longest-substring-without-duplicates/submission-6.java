class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int l=0,r=0,mlen=0;
        while(r<s.length()){
            char c=s.charAt(r);
            if(mp.containsKey(c)){
                l=Math.max(l,mp.get(c)+1);
            }
            mlen=Math.max(mlen,(r-l)+1);
            mp.put(c,r);
            r++;
        }
        return mlen;
    }
}
