class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        //This is one of the most important question of Merge-Interval pattern...
        ArrayList<int[]> lst = new ArrayList<>();
        int i=0,j=0;
        int start1=0,end1=0;
        int start2=0,end2=0;
        int n=firstList.length;
        int m=secondList.length;
        ///...
        while(i<n && j<m){
            start1=firstList[i][0];end1=firstList[i][1];
            start2=secondList[j][0];end2=secondList[j][1];
            ///....
            if(start1<=start2){
                if(end1>=start2){
                    int[] temp = new int[2];
                    temp[0]=Math.max(start1,start2);
                    temp[1]=Math.min(end1,end2);
                    lst.add(temp);
                }
            }
            else if(start1>start2){
                if(end2>=start1){
                    int[] temp =new int[2];
                    temp[0]=Math.max(start1,start2);
                    temp[1]=Math.min(end1,end2);
                    lst.add(temp);
                }  
            }
            ///Bhai ,jo pehle khatam hoga, wo increment hoga hmm ye cheez end point ke basis pe karenge,hmm iss cheez ko merge two sorted array ke concept se samjh sakte hai...
            if(end1<=end2){
                    i++;
                }
            else if(end1>end2) j++;
        }

        return lst.toArray(new int[lst.size()][]); 
    }
}
