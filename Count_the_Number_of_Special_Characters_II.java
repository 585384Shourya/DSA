class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small = new int[26];
        int[] capital = new int[26];
        int[] ans = new int[26];
        ///...
        for(int i=0;i<26;i++){
            small[i]=-1;
            capital[i]=-1;
        }

        ///...
        int i=0;
        while(i < word.length()){
            char ch=word.charAt(i);
            if(ch>=65 && ch<=90){
                if(capital[ch-'A']==-1) capital[ch-'A']=i;
                else{
                    i++;
                    continue;
                }
                char temp=Character.toLowerCase(ch);
                if(small[temp-'a'] !=-1 && small[temp-'a']<capital[ch-'A']) ans[ch-'A']=1;
            }
            else if(ch>=97 && ch<=122){
                small[ch-'a']=i;
                char temp=Character.toUpperCase(ch);
                if(capital[temp-'A']!=-1 && small[ch-'a']>capital[temp-'A'] && ans[ch-'a']!=0) ans[ch-'a']--;
            }
            i++;
        }
        ///...
        int count=0;
        for(int ele : ans) count+=ele;
        
        return count;
    }
}
