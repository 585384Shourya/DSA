class Solution {
    public String toLowerCase(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        while(i<s.length()){
           if(ch[i]>=65 && ch[i]<=90)ch[i] = (char) (ch[i] + 32);
            i++;
        }
        return new String(ch);
    }
}
