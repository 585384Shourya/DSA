class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int temp=nums[i];
            ArrayList<Integer> req = new ArrayList<>();
            while(temp!=0){
                int num=temp%10;
                temp/=10;
                req.add(num);
            }
            Collections.reverse(req);
            ///...
            for (int nmbr : req) {
                lst.add(nmbr);
            }
            i++;
        }
        //Now,putting elements of list in Array..
        int totalElements = lst.size();
        int[] arr = new int[totalElements];
        int j=0;
        for(int ele : lst) {
            arr[j]=ele;
            j++;
        }

        return arr;
    }
}
