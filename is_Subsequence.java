public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()!=0 && t.length()==0) return false;
        else if(s.length()==0 || t.length()==0) return true;
        //...
        int[] arr = new int[s.length()];
        int i=0,j=0,count=0;
        //...
        while(i<t.length() && j<s.length()){
            char ch=s.charAt(j);
            if(ch==t.charAt(i)){
                arr[j]=i;
                j++;
                count++;
            }
            i++;
        }
        //...
        if(count==s.length()) return true;

        return false;
    }
} {
    
}
