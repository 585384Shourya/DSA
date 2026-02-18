class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        int i=0,j=0;
        while(i<word1.length || j<word2.length){
            if(i<word1.length){str1=str1+word1[i];i++;}
            if(j<word2.length){str2=str2+word2[j];j++;}
        }
        
        return str1.equals(str2);
    }
}
