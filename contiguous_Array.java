class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLength=0,zeros=0,ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            else ones++;
            ///...
            int diff=ones-zeros;
            //Agar map wo key contain kar raha ho tab hi ye condition true hoga...
            if(map.containsKey(diff)){
              int length = i-(map.get(diff));
              if(length>=maxLength) maxLength=length;
              ///bhai ye continue iss liye likha hai ,kuki hmm nahi chahta ki ,jo hmara i hai wo increment kar jae map me, aur maan lo aage bhi difference agar same aya to uska length kam ho jayega...
              continue;
            }
            map.put(diff,i);
        }
        return maxLength;
    }
}
