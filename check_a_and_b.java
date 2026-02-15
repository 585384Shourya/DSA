class Solution {
    public boolean checkString(String s) {
        int i=1;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='a' && s.charAt(i-1)=='b')return false;
            i++;
        }
        return true;
    }
}
