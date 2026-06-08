class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> lst = new ArrayList<>();
        int[] ans = new int[n];
        ///For less than...
        for(int ele : nums){
            if(ele<pivot) lst.add(ele);
        }
        ///For equals to...
        for(int ele : nums){
            if(ele == pivot) lst.add(ele);
        }
        ///.For greater than...
        for(int ele : nums){
            if(ele>pivot) lst.add(ele);
        }
        ///Putting all values of lst into ans array...
        int i=0;
        for(int ele : lst){
            ans[i]=ele;
            i++;
        }

        return ans;
    }
}
///Ya,fir aise bhi kar sakte hai ki ek hi baar me smaller ke liye traverse karo left to right aur greater ke liye right to left aur pivot ko baad me insert kar do...