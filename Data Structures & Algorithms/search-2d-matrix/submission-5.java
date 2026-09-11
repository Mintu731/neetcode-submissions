class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=matrix.length*matrix[0].length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int rows=mid/matrix[0].length,col=mid%matrix[0].length;
            if(matrix[rows][col]== target){return true;}
            if(target<matrix[rows][col]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }


       
        return false;
    }
}
