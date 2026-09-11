class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int [] pre =new int[arr.length+1];
        int c=0;
        for(int i=0; i<arr.length; i++){
            pre[i+1]=pre[i]+arr[i];
        }
        for(int j=k-1; j<arr.length; j++){
            if(((pre[j+1]-pre[j-k+1])/k) >= threshold) c++;
        }
        return c;
    } 
}