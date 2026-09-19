class Solution {
    public String reverseWords(String s) {
        String str="";
        int count=0;
        int i=s.length()-1;
        int end=-1;
        while(i>=0){
            char ch=s.charAt(i);
            if(ch!=' ' && count==0){
                end=i;
                count=1;
            }
            else if(count==1 && ch==' '){
                str+=s.substring(i+1,end+1);
                str+=" ";
                count=0;
            }
            i--;
        }

        if(count==1) str+=s.substring(i+1,end+1);

        return str.trim();
    }
}
