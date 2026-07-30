class Solution {
    public int minimumPushes(String word) {
        int n=word.length(),pushes=0;

        ///...
        int i=0;
        while(i<n){
            if(i<=7) pushes+=1;
            else if(i<=15) pushes+=2;
            else if(i<=23) pushes+=3;
            else pushes+=4;
            i++;
        }

        return pushes;
    }
}
