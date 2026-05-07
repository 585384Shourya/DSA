class Solution {
    public int[][] merge(int[][] intervals) {
        ///...
        int n=intervals.length;
        ArrayList<int[]> lst = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ///...
        int i=0;
        int start1=intervals[i][0],end1=intervals[i][1];
        int marked=0;
        i++;
        while(i<n){
            int start2=intervals[i][0],end2=intervals[i][1];
            ///Check kar rahe hai condition, ki kahin interval merge to nhi ho rha hai...
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                
            }
            else if(start2>end1){
                int[] temp = new int[2];
                temp[0]=start1;
                temp[1]=end1;
                lst.add(temp);
                start1=start2;
                end1=end2;
            }
            i++;
            ///...
        }

        ///Bhai jo last me intervals array me bach jayega wo yaha add kar denge...
            int[] temp = new int[2];
            temp[0]=start1;
            temp[1]=end1;
            lst.add(temp);
        
        return lst.toArray(new int[lst.size()][]);
    }
}
