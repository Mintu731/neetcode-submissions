class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int flcount=0;
        Stack<Double> st=new Stack<>();
        Double[][] res=new Double[position.length][2];
        for(int i=0; i<speed.length; i++){
            res[i][0]=(double)position[i];
            res[i][1]=(double)speed[i];
        }
        Arrays.sort(res,(a,b)->{return Double.compare(b[0],a[0]);});

        for(int i=0; i<speed.length; i++){
            Double d=(target-res[i][0]);
            Double s=d/res[i][1];
            
            if(st.isEmpty()){
                st.push(s);
            }else if(s>st.peek()){
                st.push(s);
            }
            
        }
        return st.size();
    }
}
