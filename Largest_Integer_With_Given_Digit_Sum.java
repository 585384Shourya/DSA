class Solution {
    public int backTrack(int n, int s, int idx, List<Integer> lst, int lar){
        if(idx<=n){
            int add=0,sz=lst.size(),j=1,num=0;
            for(int i=sz-1;i>=0;i--){
                add+=lst.get(i);
                num+=(lst.get(i)*j);
                j*=10;
            }
            if(add==s) {
                lar=Math.max(lar,num);
            }
        }
        else if(idx>n) return lar;

        ///...
        for(int i=0;i<=9;i++){
            lst.add(i);
            lar=backTrack(n,s,idx+1,lst,lar);
            lst.remove(lst.size()-1);
        }

        return lar;
    }

    ///...
    public int largestInteger(int n, int s) {
        if(s==0) return 0;

        ///...
        List<Integer> lst = new ArrayList<>();
        int idx=0,lar=-1;
        return backTrack(n,s,idx,lst,lar);
    }
}
