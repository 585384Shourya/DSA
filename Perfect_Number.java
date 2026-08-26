class Solution {
    public boolean checkPerfectNumber(int num) {
        int ans=0,temp=num;
        for(int i=1;i*i<=num;i++){
            if(i!=num && num%i==0){
                ans+=i;
                if(num/i!=i && num/i!=temp) ans+=num/i;
            } 
        }
        if(ans==temp) return true;
        return false;
    }
}