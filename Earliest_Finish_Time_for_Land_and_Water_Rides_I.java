class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE,time=0;
        ///Land Ride...
        for(int i=0;i<landStartTime.length;i++){
            time+=(landStartTime[i]+landDuration[i]);
            for(int j=0;j<waterStartTime.length;j++){
                if(waterStartTime[j]<=time) time+=waterDuration[j];
                else if(waterStartTime[j]>time) time=(waterStartTime[j]+waterDuration[j]);
                min=Math.min(time,min);
                time = landStartTime[i]+landDuration[i];
            }
            time=0;
        }

        ///Water Ride...
        for(int i=0;i<waterStartTime.length;i++){
            time+=(waterStartTime[i]+waterDuration[i]);
            for(int j=0;j<landStartTime.length;j++){
                if(landStartTime[j]<=time) time+=landDuration[j];
                else if(landStartTime[j]>time) time=(landStartTime[j]+landDuration[j]);
                min=Math.min(time,min);
                time = waterStartTime[i]+waterDuration[i];
            }
            time=0;
        }

        return min;
    }
}
