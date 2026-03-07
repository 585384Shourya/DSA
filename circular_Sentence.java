class Solution {
    public boolean isCircularSentence(String sentence) {
        int flag=1,i=0;
        //...
        while(i<sentence.length()){
            char ch=sentence.charAt(i);
            if(ch==' '){
                flag=0;
            }
            else if(flag==0){
                char prev=sentence.charAt(i-2);
                if(ch!=prev) return false;
                flag=1;
            }
            i++;
        }
        //...
        if(sentence.charAt(i-1)==sentence.charAt(0)) return true;

        return false;
    }
}
