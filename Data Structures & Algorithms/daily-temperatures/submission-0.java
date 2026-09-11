class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> q=new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1; i>=0; i--){
           while( !q.isEmpty() && temperatures[q.peekLast()]<=temperatures[i] ){
                q.pollLast();
                }
                if(!q.isEmpty()){
                    ans[i]=q.peekLast()-i;
                }
                else{ans[i]=0;}
                q.offerLast(i);
            }
            return ans;
        }
        
    }

