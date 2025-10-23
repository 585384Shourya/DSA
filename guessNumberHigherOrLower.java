/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class guessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int st=1,end=n,mid;
        while(st<=end){
            mid=st+(end-st)/2;
           int ans=guess(mid);
           if(ans==-1){
            end=mid-1;
           }
           else if(ans==1){
            st=mid+1;
           }
           else if(ans==0){
            return mid;
           }

        }
        return -1;
    }
}
