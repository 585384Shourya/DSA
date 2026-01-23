class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(i<n){
            if(st.size()==0){
                st.push(i);
                i++;
            }
            else if(temperatures[st.peek()]<temperatures[i]){
                int x=st.pop();
                ans[x]=i-x;
            }
            else if(temperatures[st.peek()]>=temperatures[i]){
                st.push(i);
                i++;
            }
        }
        //...
        while(st.size()>0){
            ans[st.pop()]=0;
        }

        return ans;
    }
}
