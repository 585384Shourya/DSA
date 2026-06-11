import java.util.Scanner;

class Main {
    public static String Encryption(String str){
        int i=0;
        String enStr="";
        while(i<str.length()){
            enStr+=(char)(str.charAt(i)+3);
            i++;
        }
        
        return enStr;
    }
    
    ///......
    
    public static String Decryption(String str){
        int i=0;
        String deStr="";
        while(i<str.length()){
            deStr+=(char)(str.charAt(i)-3);
            i++;
        }
        
        return deStr;
    }
    
    ///......
    public static void main(String[] args) {
        System.out.println("Caesar cipher Encryption Decryption");
        
        //Shift character by 3 times..
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String copy1=Encryption(str);
        System.out.println("Encrypted code: "+copy1);
        String copy2=Decryption(copy1);
        System.out.println("Decrypted code: "+copy2);
        
        return ;
    }
}
