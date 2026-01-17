public import java.util.*;
 class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<operations.length){

            String str=operations[i];
            if(str.equals("C")){
                 st.pop();
            }
            else if(str.equals("D")){
                st.push(2*st.peek());
            }
            else if(str.equals("+")){
               int val1=st.pop();
                int val2=st.pop();
                int ans=val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(str));
            }
            i++;
        }
        int sum=0;
        while(st.size()!=0){
            sum=sum+st.pop();
        }
        return sum;
    }
} {
    
}
