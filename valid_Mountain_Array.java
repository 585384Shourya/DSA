class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int i=0,j=arr.length-1,count1=0,count2=0;
        while(i<j){
            if(arr[i]<=arr[i+1]){
                if(arr[i]==arr[i+1])return false;
                i++;
            }
            else{
                count1=1;
            }

            if(arr[j]<=arr[j-1]){
                if(arr[j]==arr[j-1])return false;
                j--;
            }
            else{
                count2=2;
            }


            if(i==j)return true;
            else if(i==0 || j==arr.length-1)return false;
            else if(count1==1 && count2==2)return false;
           
        }
        return true;
    }
}