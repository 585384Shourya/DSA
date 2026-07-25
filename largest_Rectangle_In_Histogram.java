class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st = new Stack<>();
        int[] pvs_Smaller = new int[n];
        int[] nxt_Smaller = new int[n];

        ///pvs_Smaller...
        int i=0;
        while(i<n){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) pvs_Smaller[i]=-1;
            else pvs_Smaller[i]=st.peek();
            st.push(i);
            i++;
        }

        while(!st.isEmpty()) st.pop();

        ///nxt_Smaller...
        i=n-1;
        while(i>=0){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]) st.pop();
            if(st.isEmpty()) nxt_Smaller[i]=n;
            else nxt_Smaller[i]=st.peek();
            st.push(i);
            i--;
        }

        ///...
        int max=Integer.MIN_VALUE,res=0;
        i=0;
        while(i<n){
            res=heights[i]*(nxt_Smaller[i]-(pvs_Smaller[i])-1);
            max=Math.max(max,res);
            i++;
        }

        return max;
    }
}