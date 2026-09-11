class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=-1,l=0,r=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++){
            if(target<=matrix[i][matrix[0].length-1]){
            row=i;
            break;
            }
         }
         if(row==-1)return false;
        while(l<=r){
            int mid=(l+r)/2;
            if(matrix[row][mid]==target)return true;
            if(target<matrix[row][mid])r=mid-1;
            else l=mid+1;
        }
        return false;
    }
}
