class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        int[] arr = new int[256];
        int min = Integer.MAX_VALUE, si = 0, l = 0, r = 0, c = 0;
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]++;
        }
        while (r < s.length()) {
            if (arr[s.charAt(r)] > 0) {
                c++;
               
            } 
                arr[s.charAt(r)]--;
            
            while (c == t.length()) {
               if ((r - l + 1) < min) {
                    min = r - l + 1;
                    si = l;
                }
                arr[s.charAt(l)]++;
                if(arr[s.charAt(l)] > 0){
                    c--;
                    
                }
                
                  l++;
                }
                r++;
            }
            System.out.print(min);
           return (min == Integer.MAX_VALUE ? "" : s.substring(si,si+min));
        }
    }

