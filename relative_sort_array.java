class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int i=0,k=0;
        while(i<n){
            if(k==m){
                break;
            }
            Boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr1[i]==arr2[k]){
                    i++;
                    flag=true;
                    break;
                }
                else if(arr1[i]!=arr2[k]){
                    if(arr2[k]==arr1[j]){
                        flag=true;
                        int temp=arr1[j];
                        arr1[j]=arr1[i];
                        arr1[i]=temp;
                        i++;
                        break;
                    }
                }
            }
            if(flag==false){
                k++;
            }
        }
        int l=i;
        for(;i<n-1;i++){
            Boolean flag=false;
            for(int o=l;o<n-1;o++){
                if(arr1[o]>arr1[o+1]){
                    int temp=arr1[o];
                    arr1[o]=arr1[o+1];
                    arr1[o+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return arr1;
            }
        }
        return arr1;
    }
}