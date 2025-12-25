import java.util.ArrayList;
class  Solution {
    public boolean isValid(String s) {
        ArrayList<Character> lst=new ArrayList<Character>();
        int i=0,j=0;
        while(i<s.length()){
            if(j==0){
                lst.add(s.charAt(i));
                i++;
                j++;
            }
            else{
                switch(s.charAt(i)){

                    case ')': if(lst.get(j-1)=='('){
                                 i++;
                                 j--;
                                 lst.remove(j);
                                }
                               else if(lst.get(j-1)!='('){
                                 lst.add(s.charAt(i));
                                 i++;
                                 j++;    
                               }break;
                               
                    case '}': if(lst.get(j-1)=='{'){
                                 i++;
                                 j--;
                                 lst.remove(j);
                                }
                               else if(lst.get(j-1)!='{'){
                                 lst.add(s.charAt(i));
                                 i++;
                                 j++;    
                               }                                                                                                                           break;


                    case ']': if(lst.get(j-1)=='['){
                                 i++;
                                 j--;
                                 lst.remove(j);
                                }
                               else if(lst.get(j-1)!='['){
                                 lst.add(s.charAt(i));
                                 i++;
                                 j++;    
                               }break;

                    default :   lst.add(s.charAt(i));
                                 i++;
                                 j++; 
                                 break;          
                }
            }
        }
        if(lst.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}