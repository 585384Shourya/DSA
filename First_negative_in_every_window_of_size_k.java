class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue<Integer> qu = new ArrayDeque<>();
        List<Integer> lst = new ArrayList<>();
        ///...
        int low=0,high=0;
        for(;high<k;high++){
            if(arr[high]<0) qu.add(high);
        }
        
        if (qu.peek()==null) lst.add(0);
        else if(qu.peek()>=low && qu.peek()<high){
                lst.add(arr[qu.peek()]);
                if(qu.peek()==low) qu.poll(); 
        }
        low++;
        
        ///...
        while(high<arr.length){
             if(arr[high]<0) qu.add(high);
             if (qu.peek()==null) lst.add(0);
             else if(qu.peek()>=low && qu.peek()<=high){
                lst.add(arr[qu.peek()]);
                if(qu.peek()==low) qu.poll(); 
             }
             low++;
             high++;
        }
        
        return lst;
    }
}
