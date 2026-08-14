class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int low=0,high=0,length=0;

        ///...
        while(high<n){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>2){
                char left=s.charAt(low);

                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                low++;
            }

            length=Math.max(length,(high-low)+1);
            high++;
        }

        return length;
    }
}
