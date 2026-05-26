class Solution {
    public int numberOfSpecialChars(String word) {
        int[] arr1 = new int[26];//for small...
        int[] arr2 = new int[26];//for capital...
        ///...
        int count=0;
        int i=0,j=0;
        while(i<word.length()){
            char ch = word.charAt(i);
            if(ch>=65 && ch<=90){
                if(arr2[ch-65]==0){
                    arr2[ch-65]=1;
                }
                char temp=Character.toLowerCase(ch);
                if(arr1[temp-97]==1){
                    arr2[ch-65]=-1;
                    arr1[temp-97]=-1;
                    count++;
                }
            }
            else if(ch>=97 && ch<=122){
                if(arr1[ch-97]==0){
                    arr1[ch-97]=1;
                }
                char temp=Character.toUpperCase(ch);
                if(arr2[temp-65]==1){
                    arr2[temp-65]=-1;
                    arr1[ch-97]=-1;
                    count++;
                }
            }
            i++;
        }

        return count;
    }
}