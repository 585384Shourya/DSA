class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=new Stack<>();
        Stack<Character> st=new Stack<>();
        int i=0,j=0;
        char sh='0',th='0';
        while(i<s.length() || j<t.length()){
            if(i<s.length()){
                sh=s.charAt(i);
            }
            if(j<t.length()){
                 th=t.charAt(j);
            }

            //...
            if(i==0){
                if(sh=='#'){
                }
                else{
                    ss.push(sh);
                }
                i++;
            }
            else if(i!=0 && i!=s.length()){
                if(sh=='#'&& (ss.size()>0 && ss.peek()!='#')){
                    ss.pop();
                }
                else if(sh=='#'&& (ss.size()==0)){
                    
                }
                else if(sh!='#'){
                    ss.push(sh);
                }
                i++;
            }
            //...
            if(j==0){
                if(th=='#'){
                }
                else{
                    st.push(th);
                }
                j++;
            }
            else if(j!=0 && j!=t.length()){
                if(th=='#'&& (st.size()>0 && st.peek()!='#')){
                    st.pop();
                }
                else if(th=='#'&& (st.size()==0)){
                    
                }
                else if(th!='#'){
                    st.push(th);
                }
                j++;
            }

        }

        //...
         while(ss.size()!=0 && st.size()!=0){
                if(ss.pop()!=st.pop()){
                    return false;
                }
         }
        if(ss.size()==0 && st.size()!=0){
            return false;
        }
        else if(ss.size()!=0 && st.size()==0){
            return false;
        }
        else if(ss.size()==0 && st.size()==0){
            return true;
        }
        


        return true;
    }
}
