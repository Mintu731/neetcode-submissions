class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>  mp = new HashMap<>();
        List<Integer>[] li=new List[nums.length+1];
        for(int n: nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        for (int i = 0; i < li.length; i++) {
            li[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            li[entry.getValue()].add(entry.getKey());
        }
        int p1=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=li.length-1; i>=0; i--){
            for(int n: li[i]){
                 if(p1>=k){break;}
                ans.add(n);
                 p1++;
            }
        }
        System.out.println(ans);
        int [] arr=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            arr[i]=ans.get(i);
        }
       
            return  arr;
           
        }
    }

