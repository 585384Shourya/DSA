class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour==12) hour=0;
        double hr_Angle=(30*hour+(0.5*minutes)),min_Angle=(6*minutes);
        double angle=Math.abs(hr_Angle-min_Angle);
        if(angle>180) return 360-angle;

        return angle;
    }
}