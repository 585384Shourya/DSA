class Solution {
    public int countDigits(int num) {
        int temp=num,count=0;
        while(temp!=0){
            int div=temp%10;
            if(num%div==0) count++;
            
            temp/=10;
        }
        return count;
    }
}
