public class Main{
    public static void main(String[] args){
        int n=9,k=0;
        for(int i=0;i<=n;i++){
            
            for(int j=0;j<=n;j++){
                if(i<=(n/2)){
                    if(j<=i || j>=(n-i)) System.out.print(" * ");
                    else System.out.print("   ");
                }
                else{
                    if(j<=(n-i) || j>=i) System.out.print(" * ");
                    else System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}