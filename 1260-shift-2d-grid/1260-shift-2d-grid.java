class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        k = k % (m*n);
        for(int i=0; i<m; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j<n; j++){
                temp.add(0);
            }
            list.add(temp);
        }
        
        for(int i=0; i<m ; i++){
            for(int j=0; j<n ; j++){
                int x = (i*n)+j;
                int idx = (x+k) % (m*n);
                int r = idx / n;
                int c = idx % n;

                list.get(r).set(c, grid[i][j]);
            }
        }
        return list;
       
    }
}