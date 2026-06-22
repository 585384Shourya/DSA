class Solution {
    public int maxDistance(String moves) {
        int netHr=0,netVr=0,count=0;
        int i=0;
        while(i<moves.length()){
            char ch=moves.charAt(i);
            if(ch=='U') netVr++;
            else if(ch=='D') netVr--;
            else if(ch=='L') netHr--;
            else if(ch=='R') netHr++;
            else if(ch=='_') count++;
            i++;
        }
        return Math.abs(netHr)+Math.abs(netVr)+count;
    }
}