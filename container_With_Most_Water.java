class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1,max_Volume=Integer.MIN_VALUE,curr_Volume=0;
        int left_Pole=0,right_Pole=n;
        ///...
        while(left_Pole < right_Pole){
            curr_Volume=Math.min(height[right_Pole],height[left_Pole])*(right_Pole-left_Pole);
            if(curr_Volume>max_Volume) max_Volume=curr_Volume;

            if(height[left_Pole] < height[right_Pole]) left_Pole++;
            else if(height[left_Pole] > height[right_Pole]) right_Pole--;
            else if(height[left_Pole] == height[right_Pole]){
                left_Pole++;
                right_Pole--;
            }
        }
        return max_Volume;

     ///Just trying again...


        // int i=0,j=height.length-1,max=Integer.MIN_VALUE;
        // while(i<j){
        //     int cmax=(j-i)*Math.min(height[i],height[j]);
        //     if(cmax>max){
        //         max=cmax;
        //     }

        //     if(height[i]<=height[j]){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // return max;
    }
}
