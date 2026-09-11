

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        
        for(int i=0 ; i<=rowIndex; i++){
            li.add(1);
            for(int j=i-1; j>0; j--){
                li.set(j,li.get(j)+li.get(j-1));
            }
        }
        
    return li;
    }
}