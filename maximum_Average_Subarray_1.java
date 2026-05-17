class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int prefix_Sum=0,max_Average=Integer.MIN_VALUE;

    //Ye fix size sliding window ka Question hai...Pehle hmm ,pehla Subarray ka sum nikal lete hai jiska size k hai, aur yahi chhez Solution ko Optimal banati hai...
        for(int i=0;i<k;i++){
            prefix_Sum+=nums[i];
        }
        if(max_Average<prefix_Sum) max_Average=prefix_Sum;
        ///Abb aage aur k size wale Subarray ka average nikal kar compare karenge aur maximum return kar denge 
        for(int i=k;i<nums.length;i++){
            prefix_Sum+=nums[i]-nums[i-k];
            if(max_Average<prefix_Sum) max_Average=prefix_Sum;
        } 
        //Bhai, kuki jo sum sabse maximum hoga uska average bhi sabse maximum hoga isliye aisa kar diye ...Java mein calculation hamesha right side se shuru hoti hai. Jab Java prefix_Sum / k dekhta hai, toh dono variables int hote hain. Java unka integer division karke decimal uda deta hai, aur uske baad bache hue pure number (integer) ko float variable mein store karta hai.
        return (double)max_Average/k;
    }
}
