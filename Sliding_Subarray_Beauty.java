class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length,high=0,low=0,smallest=0;
        int[] ans = new int[n-k+1];
        int[] freq = new int[51];
        ///Increasing frequency of negative element...
        for(high=0;high<k;high++){
            if(nums[high]<0) freq[-nums[high]]++;
        }
        ///finding xth smallest neagative value else we will mark it 0...
        for(int l=50; l>=1; l--){
            smallest += freq[l]; 
            if(smallest >= x){   
                 ans[low]=-l;
                 break;
            }
        }

        ///...
        smallest=0;
        
        // Pointers ko agali window ke liye setup karo
        int ansIndex = 1; // Answer array ka track rakhne ke liye...

        while(high<n){
           if (nums[low] < 0) {
                freq[-nums[low]]--;
            }
            
           low++;
           ///...
           if(nums[high]<0) freq[Math.abs(nums[high])]++;
   
           ///...
           for(int l=50; l>=1; l--){
               smallest += freq[l]; 
               if(smallest >= x){   
                 ans[low]=-l;
                 break;
                }
            }
            smallest=0;

            ///...
            high++;
            ansIndex++;
        }

        return ans;
    }
}