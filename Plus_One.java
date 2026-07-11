class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i=digits.length-1,temp=0;
        while(i>=0){
            if(i==(digits.length-1)){
                if(digits[i]+1==10){
                    lst.add(0);
                    temp=1;
                }
                else{
                    lst.add(digits[i]+1);
                }
            }
            else{
                if(digits[i]+temp==10){
                    lst.add(0);
                    temp=1;
                }
                else{
                    lst.add(digits[i]+temp);
                    temp=0;
                }
            }
            i--;
        }
        if(temp==1) lst.add(1);

        ///...
        int[] arr = new int[lst.size()];
        i=arr.length-1;
        for(int ele:lst){
            arr[i]=ele;
            i--;
        }
        return arr;
    }
}