class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //This question is based on same pattern as Merge Intervals ,only change is that we have to first insert the interval then Merge-Interval...
        int n=intervals.length;
        int[][] duplicateIntervals = new int[n+1][2];
        //See,now we will compare start of new interval with start of evry interval present in Intervals 2D Array...
        boolean marked=false;
        int j=0;
        for(int i=0;i<n;i++){
            //checking condition...
            if(marked==false && intervals[i][0]>=newInterval[0]){
                duplicateIntervals[j]=newInterval;
                j++;
                marked=true;
            }
            duplicateIntervals[j]=intervals[i];
            j++;
        }
        
        //This means ,that start of our newInterval is greatest among all start of intervals present in Intervals 2D Array...
        if(marked==false) duplicateIntervals[j]=newInterval;
        //...
        //Code for Merging Intervals...
        ArrayList<int[]> lst = new ArrayList<>();
        int i=0;
        int start1=duplicateIntervals[i][0],end1=duplicateIntervals[i][1];
        i++;
        int m=duplicateIntervals.length;
        while(i<m){
            int start2=duplicateIntervals[i][0],end2=duplicateIntervals[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
            }
            else if(end1<start2){
                int[] temp = new int[2];
                temp[0]=start1;
                temp[1]=end1;
                lst.add(temp);
                start1=start2;
                end1=end2;
            }
            i++;
        }

        //bhai ,jo baki bache hue intervals hai duplicateIntervals  2D Array ke andar usko mai seedha add kar rha hu list me...
                int[] temp = new int[2];
                temp[0]=start1;
                temp[1]=end1;
                lst.add(temp);

       return lst.toArray(new int[lst.size()][]);        
    }
}