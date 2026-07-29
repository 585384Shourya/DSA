class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
              char ch=s.charAt(i);
              freq[ch-'a']++;
        }
        ///...
        StringBuilder sb = new StringBuilder();
        int odd=-1,flag=0;
        for(int i = 0; i < 26; i++){

             if(freq[i]>0){
                if(freq[i]%2!=0){
                    odd=i;
                    flag=1;
                }
                int temp=freq[i]/2;

                ///...
                while(temp!=0){
                    sb.append((char)('a'+i));
                    temp--;
                }
             }
        }

        ///...


        if(flag==1){
            sb.append((char)('a'+odd));

            for(int i=sb.length()-2;i>=0;i--){
                char ch = sb.charAt(i);
                sb.append(ch);
            }
        }
        else{
            for(int i=sb.length()-1;i>=0;i--){
                char ch = sb.charAt(i);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}