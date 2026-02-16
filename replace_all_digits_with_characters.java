class Solution {
    public String replaceDigits(String s) {
        char[] str=s.toCharArray();
        int i=1;
        while(i<s.length()){
            char ch=str[i-1];
            str[i] = (char) ((str[i] - '0') + ch);
            i+=2;
        }
       
        return new String(str);
    }
}
