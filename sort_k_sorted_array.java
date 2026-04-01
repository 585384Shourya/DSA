class Solution {
    public void nearlySorted(int[] arr, int k) {
        //bhai isme hme array sorted chahiye ,hmm yaha min-heap ka use karenge aur array ko sort karenge hme ye nhi sochna ki kahi array ka element gayab ho gaya to ,kuki wo element hmare pas already stored hoga min-heap me aur wait kar raha hoga apne correct position ane ka...
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int idx=0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++]=pq.poll();
        }
        //...
        //baki jo bache hue elements honge heap me  wo yaha se remove hoke array me stored ho jayenge...
        while(pq.size()>0){
            arr[idx++]=pq.poll();
        }
        
    }
}
