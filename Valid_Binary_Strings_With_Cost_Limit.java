class Solution {
    public static List<String> backTrack(List<String> lst ,String str ,int n ,int cost ,int k){

        ///...

        if(str.length()==n){
            if(cost<=k) lst.add(str);
            return lst;
        }
        ///For adding 0...
        backTrack(lst,str+0,n,cost,k);
        ///For adding 1...
        if(str.length()!=0 && str.charAt(str.length()-1)=='1') return lst;
        ///...
        int currentIndex=str.length();
        backTrack(lst,str+1,n,cost+currentIndex,k);

        return lst;

        ///...
    }
    public List<String> generateValidStrings(int n, int k) {
        List<String> lst = new ArrayList<String>();
        String str="";
        int cost=0;
        return backTrack(lst ,str ,n ,cost ,k);
    }
}
