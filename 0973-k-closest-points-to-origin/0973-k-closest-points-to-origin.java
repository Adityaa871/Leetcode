class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int []> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(
                a[0] * a[0] + a[1] * a[1],
                b[0] * b[0] + b[1] * b[1]
            )
        );
        
        for(int [] x : points){
            pq.add(x);
        }
        int [][] arr = new int[k][2];

        for(int i=0; i<k; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}