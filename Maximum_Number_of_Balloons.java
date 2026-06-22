class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch-'a']++;
        }
        ///...
        int min=Integer.MAX_VALUE;
        String str="balloon";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='l' || ch=='o'){
                if(freq[ch-'a']%2!=0)  min=Math.min((freq[ch-'a']-1)/2,min);
                else min=Math.min(freq[ch-'a']/2,min);
            }
            else min=Math.min(freq[ch-'a'],min);
        }

        return min;
    }
}