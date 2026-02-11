class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int n=s.length(),low=0,high=0,size=0;
        ///...
        while(high<n){
            char curr=s.charAt(high);
            ///...
            while(set.contains(curr)){
                char left=s.charAt(low);
                set.remove(left);
                low++;
            }
            ///...
            set.add(curr);
            if(size<(high-low)+1)size=(high-low)+1;

            high++;
        }
        return size;
    }
}
