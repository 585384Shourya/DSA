import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')' || ch==']' || ch=='}'){
                if(st.size()==0){
                    return false;
                }
                else{
                    if(ch==')'){
                        if(st.peek()=='(')st.pop();
                        else st.push(ch);
                    }
                    else if(ch==']'){
                        if(st.peek()=='[')st.pop();
                        else st.push(ch);
                    }
                    else if(ch=='}'){
                        if(st.peek()=='{')st.pop();
                        else st.push(ch);
                    }
                }
            }
            i++;
        }
        if(st.size()>0) return false;
        return true;
    }
}
