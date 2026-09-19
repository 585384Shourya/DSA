class Solution {
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==0){
                    System.out.print("* ");
                    break;
                } 
                else if(i==n-1) System.out.print("* ");
                else if(j==0 || j==i) System.out.print("* ");
                else if(j>0 && j<i) System.out.print("  ");
            }
            System.out.println();
        }
        
        return;
    }
}
