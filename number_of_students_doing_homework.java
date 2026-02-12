class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0,i=0,n=startTime.length;
        while(i<n){
            if(startTime[i]<=queryTime && queryTime<=endTime[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
