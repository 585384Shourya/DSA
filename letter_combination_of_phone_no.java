import java.util.*;
class Solution {
    static List<String> mapping(String[] s,String digits,List<String> li){
        List<String> local=new ArrayList<>();
        if(digits.length()==0){
            return li;
        }
        int d=digits.charAt(0)-'0';
        String main=s[d];
        
        for(String j:li){
            for(int i=0;i<main.length();i++){
                local.add(j+main.charAt(i));
            }
        }
       return  mapping(s,digits.substring(1),local);
        
    }
    public List<String> letterCombinations(String digits) {
        String[] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> li=new ArrayList<>();
        if(digits.length()==0)return li;
        li.add("");
        return mapping(s,digits,li);
    }
}
