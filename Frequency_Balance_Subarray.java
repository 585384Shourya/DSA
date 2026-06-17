class Solution {
    public int getLength(int[] nums) {
        int max_Length=1;
        for(int i=0;i<nums.length;i++){

            HashMap<Integer,Integer> freq = new HashMap<>();
            HashMap<Integer,Integer> freq_Count = new HashMap<>(); 

            ///...
            for(int j=i;j<nums.length;j++){
                int val=nums[j];
                if (freq.containsKey(val)) {
                    int old_f = freq.get(val);
                    freq_Count.put(old_f, freq_Count.get(old_f) - 1);
                    if (freq_Count.get(old_f) == 0) {
                        freq_Count.remove(old_f);
                    }
                }
                ///...
                freq.put(val,freq.getOrDefault(val,0)+1);
                int count=freq.get(val);//val ki frquency, count me store kar rahe hai...
                freq_Count.put(count,freq_Count.getOrDefault(count,0)+1);//Hum yaha ek hi type ki frequency jo freq map ke andar hai usko count kar rahe hai...
                if(freq.size()==1) max_Length=Math.max(max_Length,j-i+1);

                else if(freq_Count.size()==2){
                    int freq1=-1,freq2=-1;
                    for(int ele:freq_Count.keySet()){
                        if (freq1 == -1) {
                            freq1 = ele;
                        } else {
                            freq2 = ele;
                        }
                    }

                    ///...
                    int min_freq=Math.min(freq1,freq2);
                    int max_freq=Math.max(freq1,freq2);
                    ///...

                    if(min_freq*2==max_freq) max_Length=Math.max(max_Length,j-i+1);
                }

            }
        }

        return max_Length;
    }
}
