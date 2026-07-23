class Solution {
    public String smallestSubsequence(String s) {
        int[] marked = new int[26];
        HashMap<Character,Integer> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        ///...
        int i=0;
        st.push(s.charAt(i));
        map.put(s.charAt(i),map.get(s.charAt(i))-1);
        marked[s.charAt(i)-'a']=1;

        i++;
        while(i<n){
            char ch = s.charAt(i);
            while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())!=0 && marked[ch-'a']==0){
                char temp=st.pop();
                marked[temp-'a']=0;
            }
            if(marked[ch-'a']==0){
                st.push(ch);
                marked[ch-'a']=1;
            }

            map.put(ch,map.get(ch)-1);
            i++;
        }

        ///...
        StringBuilder sb = new StringBuilder();
        for(char ele : st) sb.append(ele);

        return sb.toString();
    }
}