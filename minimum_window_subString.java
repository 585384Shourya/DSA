class Solution {
    public String minWindow(String s, String t) {

        int low = 0, high = 0;
        int len = Integer.MAX_VALUE;
        int count = 0;

        int[] arr = new int[128];
        String minSub = "";

        // required frequency
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]++;
        }
        //...
        while (high < s.length()) {
            char ch = s.charAt(high);
            if (arr[ch] > 0) {
                count++;
            }

            arr[ch]--;
            //...
            while (count == t.length()) {

                if ((high - low + 1) < len) {
                    len = high - low + 1;
                    minSub = s.substring(low, high + 1); 
                }
                //...
                char left = s.charAt(low);
                arr[left]++;
                if (arr[left] > 0) {
                    count--;
                }
                low++;
            }
            high++;
        }
        return minSub;
    }
}
//Do it again...