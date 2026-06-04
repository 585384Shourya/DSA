class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            int temp=i,lw=0,md=0,up=0;
            up=temp%10;//lower value...
            temp/=10;
            md=temp%10;//middle value..
            temp/=10;
            while(temp!=0){
                lw=temp%10;//upper value...
                temp/=10;
                ///...
                if((md>lw && md>up) || (md<lw && md<up)) count++;
                up=md;
                md=lw;
            }

        }

        return count;
    }
}
