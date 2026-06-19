class Solution {
    public int largestAltitude(int[] gain) {
        int highest=0,prev=highest;
        for(int i=0;i<gain.length;i++){
            int curr=gain[i];
            highest=Math.max(highest,((prev)+curr));
            prev=((prev)+curr);
        }

        return highest;
    }
}