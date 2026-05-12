class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int count=0,max=0;
        for(int i=0;i<n;i++){
            String str = sentences[i];
            count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    count++;
                }
            }
            if(max<(count+1)){
                max=count+1;
            }
        }

        return max;
    }
}
