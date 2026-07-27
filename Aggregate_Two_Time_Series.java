class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> lst = new ArrayList<>();
        int i=0,j=0,n=series1.length,m=series2.length;
        while(i<n && j<m){
            if(series1[i][0]==series2[j][0]){
                List<Integer> lst1 = new ArrayList<>();
                lst1.add(series1[i][0]);
                lst1.add(series1[i][1]+series2[j][1]);
                lst.add(lst1);
                i++;
                j++;
            }
            else if(series1[i][0]<series2[j][0]){
                List<Integer> lst1 = new ArrayList<>();
                lst1.add(series1[i][0]);
                lst1.add(series1[i][1]+series2[j][1]);
                lst.add(lst1);
                i++;
            }
            else if(series2[j][0]<series1[i][0]){
                List<Integer> lst1 = new ArrayList<>();
                lst1.add(series2[j][0]);
                lst1.add(series1[i][1]+series2[j][1]);
                lst.add(lst1);;
                j++;
            }
        }

        ///...
        while(i!=n){
            List<Integer> lst1 = new ArrayList<>();
            lst1.add(series1[i][0]);
            lst1.add(series1[i][1]);
            lst.add(lst1);
            i++;
        }

        while(j!=m){
            List<Integer> lst1 = new ArrayList<>();
            lst1.add(series2[j][0]);
            lst1.add(series2[j][1]);
            lst.add(lst1);
            j++;
        }

        return lst;
    }
}
