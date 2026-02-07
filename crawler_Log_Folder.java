class Solution {
    public int minOperations(String[] logs) {
////without using Stack..
        int count=0,i=0;
        while(i<logs.length){
            if(logs[i].equals("./")){
                //kuch bhi mat karo..
            }
            else if(logs[i].equals("../")){
                if(count!=0){
                   count--;
                }
            }
            else{
                count++;
            }
            i++;
        }
        return count;

////using Stack...

        // Stack<String> st=new Stack<>();
        //  int count=0,i=0;
        // while(i<logs.length){
        //     if(logs[i].equals("./")){
        //         //kuch bhi mat karo..
        //     }
        //     else if(logs[i].equals("../")){
        //         if(st.size()>0){
        //             st.pop();
        //         }
        //     }
        //     else{
        //         st.push(logs[i]);
        //     }
        //     i++;
        // }

        // while(st.size()!=0){
        //     st.pop();
        //     count++;
        // }
        // return count;
    }
}
