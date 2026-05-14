class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0],b=nums[1],c=nums[2];
        if(a==b && b==c && c==a) return "equilateral";
        else if(a!=b && b!=c && c!=a){
            if(a+b>c && b+c>a && c+a>b) return "scalene";
            else  return "none";
        }
        else{
            if(a+b>c && b+c>a && c+a>b) return "isosceles";
            else  return "none";
        }

    }
}
