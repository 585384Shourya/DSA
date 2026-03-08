class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0,flag=1;
        char[] arr=new char[128];
        for(int i=0;i<brokenLetters.length();i++){
            char ch= brokenLetters.charAt(i);
            arr[ch]++;
        }

        for(int i=0;i<text.length();i++){
            char chMn=text.charAt(i);
            if(chMn==' ' && flag!=0) count++;
            else if(chMn==' '&& flag==0) flag=1;
            else if(arr[chMn]!=0){
                flag=0;
            }
        }

        if(flag==1) count++;

        return count;
    }
}
