class Solution {
    public boolean isPalindrome(String s) {
        // String s1=s.replaceAll("\\s","").toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        // System.out.println(s1);
        // for(int i=0; i<s1.length()/2; i++){
        //     if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
        //         return false;
        //     }
        // }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){left++;continue;}
            if(!Character.isLetterOrDigit(s.charAt(right))){right--;continue;}
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}
