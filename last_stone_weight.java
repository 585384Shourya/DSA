class Solution {
    public int lastStoneWeight(int[] stones) {
        // if(stones.length==1) return stones[0];
        //...
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        //hmm sare elments ko priority queue me add kar rahe hai..
        for(int ele:stones){
            pq.add(ele);
        }
        //aab main kaam karna hai, hmme har bar heaviest two element nikalna hai aur agar dono ka weight same hai to  kuch insert mat karo heap me ,agar alag weight hai to difference of weights max-min insert karo ...
        while(pq.size()>1){
            int max=pq.poll();
            int min=pq.poll();
            if(min<max) pq.add(max-min);
        }

        return pq.size()==1 ? pq.poll() : 0;
    }
} 
//do it again.. iska time complexity O(nlogn)hai...