class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int left_Count=0,right_Count=0,count_1=0;
        int i=0,max=0;
        boolean marked=false;
        char ch=s.charAt(i);
        for(;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='1') count_1++;
        }
        max=count_1;

        ///...
        i=0;
        while(i<=s.length()){

            if(i!=s.length()) ch=s.charAt(i); 
            if(i==s.length() || ch=='1'){
                if(left_Count>0 && marked==false) marked=true;
                else if((i==s.length() && right_Count>0) || right_Count>0){
                    max=Math.max(max,(count_1+left_Count+right_Count));
                    left_Count=right_Count;
                    right_Count=0;
                }
            }
            else if(ch=='0'){
                if(marked==true) right_Count++;
                else if(marked==false) left_Count++;
            }

            i++;
        }


        return max;
    }
}
