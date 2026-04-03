class Closest implements Comparable<Closest>{
    int x;
    int y;
    double dist;
    public Closest(int x,int y){
        this.x=x;
        this.y=y;
        this.dist=Math.sqrt((x*x)+(y*y));
    }
    public int compareTo(Closest temp){
        return Double.compare(this.dist,temp.dist);
    }
}
//...
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<Closest> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] cordinates:points){
            int x=cordinates[0];
            int y=cordinates[1];
            pq.add(new Closest(x,y));
            if(pq.size()>k) pq.poll();
        }
        //...yaha coordinates ko answer array me daal rahe hai priority queue se nikal kar
        for(int i=0;i<k;i++){
            ans[i][0]=pq.peek().x;
            ans[i][1]=pq.peek().y;
            pq.poll();
        }

        return ans;
    }
}
