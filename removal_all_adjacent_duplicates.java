class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length()-1;
        while(n>=0){
            char ch=s.charAt(n);
            if(st.size()==0){
                st.push(ch);
            }
            else{
                if(st.peek()==ch){
                    st.pop();
                }
                else if(st.peek()!=ch){
                    st.push(ch);
                }
            }
            n--;
        }
        s="";
        while(st.size()!=0){
            s=s+st.pop();
        }
        return s;
    }
}
