class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0,i=0,ans=0;
        //...
        while(i<s.length()){

            char ch=s.charAt(i);
            if(ch==' ' && count!=0){
                ans=count;
                count=0;
            }
            else if(ch!=' ') count++;

            i++;
        }
        //...
        if(count!=0) return count;
        
        return ans;
    }
}