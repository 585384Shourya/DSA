import java.util.Arrays;
import java.util.Scanner; 
 public class Luhn{
    public static void valid(int[] arr){
        int sum1=0;int[] ans=Arrays.copyOf(arr, arr.length);
        for(int i=arr.length-2;i>=0;){
            ans[i]=ans[i]*2;
            if(ans[i]>=10){
                ans[i]=ans[i]-9;
            }
            sum1=sum1+ans[i];
            i+=2;;
        }
        int sum2=0;
        for(int i=arr.length-1;i>=0;){
            sum2=sum2+arr[i];
            i+=2;
        }

        if((sum1+sum2)%10==0){
            System.out.println("Yes valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size:");
        int Size=sc.nextInt();
        if(Size!=16){
            System.out.println("Not valid");
        }
        System.out.print("Taking card no:- ");
        int[] arr=new int[16];
        for(int i=0;i<16;i++){
            arr[i]=sc.nextInt();
        }
        Luhn.valid(arr);
    }
}