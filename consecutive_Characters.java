    class Solution {
    public int maxPower(String s) {
        //Very simple approach...

        // int count=0,max_Power=0;
        // for(int i=0;i<s.length();i++){
        //     if(i!=0 && s.charAt(i)==s.charAt(i-1))count++;
        //     else count=1;
        //     max_Power=Math.max(count,max_Power);
        // }

        // return max_Power;

        ///Using Sliding Window...

        int low=0,high=0,max_Power=0;
        while(high<s.length()){
            ///Condition for checking character at high index shouldn't be equal to low index;
            while(s.charAt(low)!=s.charAt(high)){
                low++;
            }
            ///....
            max_Power=Math.max((high-low)+1,max_Power);
            high++;
        }

        return max_Power;

    }
}
