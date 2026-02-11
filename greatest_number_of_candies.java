class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst =new ArrayList<>();
        int i=0,n=candies.length,max=candies[0];
        //Checking for maximum..
        while(i<n){
            if(candies[i]>max){
                max=candies[i];
            }
            i++;
        }
        i=0;
        while(i<n){
            if(candies[i]+extraCandies>=max){
                 lst.add(true);
            }
            else{
                lst.add(false);
            }
            i++;
        }
        return lst;
    }
}
