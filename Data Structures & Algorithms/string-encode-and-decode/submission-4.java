class Solution {

    public String encode(List<String> strs) {
        StringBuilder s= new StringBuilder();
        for(String w:strs){
            s.append(w.length()).append("#").append(w);
        }

        System.out.println(s);
        return s.toString();
    }

    public List<String> decode(String str) {
    List<String> li=new ArrayList<>();
    int i=0;
    while(i < str.length()){
        int j=i;
        while(str.charAt(j) != '#') j++;
        int len=Integer.parseInt(str.substring(i,j));
        li.add(str.substring(j+1,j+len+1));
        i=j+len+1;
    }
    return li;
    }
}
