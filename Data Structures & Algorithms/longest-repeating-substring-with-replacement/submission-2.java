class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp=new HashMap<>();
        int l=0,r=0,mf=1,ml=0;
        while(r<s.length()){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            
                for(Map.Entry<Character,Integer> m : mp.entrySet() ){
                    mf=Math.max(mf,m.getValue());
                    System.out.println(m.getKey()+ " "+m.getValue());
                }
            if(r-l+1 - mf > k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            
            if(!mp.isEmpty()){
                for(Map.Entry<Character,Integer> m : mp.entrySet() ){
                    mf=Math.max(mf,m.getValue());
                }
            }
            }
            r++;
            System.out.println(mf);
            ml=Math.max(ml,r-l);
        }
        return ml;
    }
}
