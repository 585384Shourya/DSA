class Solution {
    static boolean canAttend(int[][] arr) {
        /*Bhai cheezo ko sort karna zarrori to nahi lekin sort karne se 
        sara Interval/Range start time ke basis pe sequence me aa jayega aur hmm overlapping time,
        kam time complexity me find kar sakte hai .warana brute force se karna padega*/
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        //...
        int i=0;
        int start1=arr[i][0],end1=arr[i][1];
        i++;
        while(i < arr.length){
            int start2=arr[i][0],end2=arr[i][1];
            if(end1>start2){
                return false;
            }
            else if(end1<start2){
                start1=start2;
                end1=end2;
            }
            i++;
        }
         return true;
    }
}