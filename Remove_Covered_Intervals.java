class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
        if (a[0] == b[0]) {
            // Agar start point same hai, toh end point descending order me sort karo
            return Integer.compare(b[1], a[1]); 
        }
        // Varna start point ascending order me sort karo
        return Integer.compare(a[0], b[0]);
        });
        
        ///...
        int i=0;
        int start1=intervals[i][0],end1=intervals[i][1];
        i++;
        int count=1;
        while(i<intervals.length){
            int start2=intervals[i][0],end2=intervals[i][1];
            if(start2>=start1 && end2<=end1){}
            else if(end1>=start2 || end1<start2){
                count++;
                start1=start2;
                end1=end2;
            }

            i++;
        }

        return count;
    }
}