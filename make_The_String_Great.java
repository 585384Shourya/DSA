class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            char ch=s.charAt(i);
            if(st.size()==0){
                st.push(ch);
            }
            else if(Math.abs(st.peek()-ch)==32){
                st.pop();
            }
            else{
                st.push(ch);
            }
            i--;
        }
    //...
    //...Use String Builder instead that will be O(n) ,this String concatination takes O(n^2)
        String str="";
        while(st.size()>0){
            str=str+st.pop();
        }
        return str;
    }
}
