class Solution {
    static boolean matched(int[] freq_P , int[] freq_S ){
        for(int i=0;i<26;i++){
            if(freq_P [i]!=freq_S[i]) return false;
        }
        return true;
    }
    ///....
    public List<Integer> findAnagrams(String s, String p) {

        //Bhai,isko hmm fixed size sliding window pattern ke approach se solve karenge...
        List<Integer> lst = new ArrayList<>(); 

        if (s.length() < p.length()) {
            return lst;
        }

        //yaha hamne, frequency array banaya hai ,issi karan hmm iss problem ko fixed size sliding window pattern ke hisab se optimal way me solve kar payenge...
        int[] freq_S = new int[26];
        int[] freq_P = new int[26];

        ///...
        for(int i=0;i<p.length();i++){
            freq_S[s.charAt(i)-'a']++;
            freq_P[p.charAt(i)-'a']++;
        }

        //Checking for first p.length() Subarray..
        if(matched(freq_P ,freq_S)){
            lst.add(0);
        }

        ///Main part...

        for(int i=p.length();i<s.length();i++){
            freq_S[s.charAt(i)-'a']++;
            freq_S[s.charAt(i-p.length())-'a']--;

            if(matched(freq_P ,freq_S)){
               lst.add((i-p.length())+1);
            }
        }

        return lst;

    }
}
