class Solution {
    public long countCommas(long n) {
        long count=0L;
        if(n == (long) Math.pow(10, 15)){
            count+=(n-(long) Math.pow(10, 15)+1)*5;
            n=(long) Math.pow(10, 15)-1;
        }
        if(n>=(long) Math.pow(10, 12) && n<=(long) Math.pow(10, 15)-1){
            count+=(n-(long) Math.pow(10, 12)+1)*4;
            n=(long) Math.pow(10, 12)-1;
        }
        if(n>=(long) Math.pow(10, 9) && n<=(long) Math.pow(10, 12)-1){
            count+=(n-(long) Math.pow(10, 9)+1)*3;
            n=(long) Math.pow(10, 9)-1;
        }
        if(n>=(long) Math.pow(10, 6) && n<=(long) Math.pow(10, 9)-1){
            count+=(n-(long) Math.pow(10, 6)+1)*2;
            n=(long) Math.pow(10, 6)-1;
        }
        if(n>=(long) Math.pow(10, 3) && n<=(long) Math.pow(10, 6)-1){
            count+=(n-(long) Math.pow(10, 3)+1)*1;
            n=(long) Math.pow(10, 3)-1;
        }

        return count;
    }
}
