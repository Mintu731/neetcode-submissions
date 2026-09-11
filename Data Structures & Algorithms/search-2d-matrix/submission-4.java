class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,rows=matrix.length,col=matrix[0].length,r=rows*col-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(matrix[mid/col][mid%col]== target){return true;}
            if(target<matrix[mid/col][mid%col]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }


       
        return false;
    }
}
