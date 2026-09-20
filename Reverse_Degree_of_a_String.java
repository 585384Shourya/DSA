class Solution {
    public int reverseDegree(String s) {
        int i=0,sum=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            int reversed=(i+1)*(26-(ch-'a'));
            sum+=reversed;
            i++;
        }

        return sum;
    }
}