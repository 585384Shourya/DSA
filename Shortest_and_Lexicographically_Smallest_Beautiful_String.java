class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int count=0;
        String ans="";
        int low=0,high=0,n=s.length();
        while(high<n){
            char ch = s.charAt(high);
            if(ch=='1') count++;

            ///...
            while(count==k){
                String sub = s.substring(low, high + 1);
                if (ans.isEmpty() || sub.length() < ans.length() || (sub.length() == ans.length() && sub.compareTo(ans) < 0)) {
                    ans = sub;
                }

                ///...
                char left = s.charAt(low);
                if(left=='1') count--;
                low++;
            }

            high++;
        }

        return ans;
    }
}