class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }

        ///...
        Arrays.sort(freq);

        int i=25,pushes=0;
        while(i>=0){
            if(i>=18 && freq[i]>0) pushes+=(freq[i]*1);
            else if(i>=10 && freq[i]>0) pushes+=(freq[i]*2);
            else if(i>=2 && freq[i]>0) pushes+=(freq[i]*3);
            else pushes+=(freq[i]*4);
            
            i--;
        }

        return pushes;
    }
}