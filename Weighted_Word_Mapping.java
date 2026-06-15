class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int i=0,n=words.length;
        String str="";
        while(i<n){
            ///...
            int j=0,num=0;
            ///...
            while(j < words[i].length()){
                num+=weights[words[i].charAt(j) - 'a'];
                j++;
            }
            str+=(char)('z'-(num%26));
            i++;
        }

        return str;
    }
}