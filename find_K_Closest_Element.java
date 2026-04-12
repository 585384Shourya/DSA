class Triplet implements Comparable<Triplet>{
    int dist;
    int val;
    Triplet(int dist,int val){
        this.dist=dist;
        this.val=val;
    }
   public int compareTo(Triplet temp) {
    // If distances are different, use the distance to compare
    if (this.dist != temp.dist) {
        return Integer.compare(this.dist, temp.dist);
    }
    // If distances are equal, the larger value is considered "worse" 
    // and should be at the top of a Max-Heap
    return Integer.compare(this.val, temp.val);
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            int dist=Math.abs(ele-x);
            pq.add(new Triplet(dist,ele));
            if(pq.size()>k) pq.poll();
        }
        //...
        while(pq.size()!=0){
            int y=pq.peek().val;
            ans.add(y);
            pq.poll();
        }
        
        Collections.sort(ans);
        return ans;
    }
}
//This question can be solve in more eay way  using two pointers,binary serch...
