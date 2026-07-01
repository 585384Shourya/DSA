class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low=0,high=0,number=0;
        while(high<s.length()){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                number+=(s.length()-high);
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                low++;
            }
            high++;
        }

        return number;
    }
}
