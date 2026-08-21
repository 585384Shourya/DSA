class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        Arrays.sort(lights);
        ///...
        for(int i=0;i<arrivalTime.length;i++) arrivalTime[i]%=period;
        
        int max=0,i=0,n=lights[lights.length-1];
        while(i<arrivalTime.length){
            if(arrivalTime[i]>=n) max=Math.max(period-arrivalTime[i],max);
            i++;
        }

        return max;
    }
}