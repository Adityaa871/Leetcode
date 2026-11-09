class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean[n][m];
        int count = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<m ; j++){
                if(grid[i][j] == '1' && vis[i][j] == false){
                    bfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(char [][] grid, boolean [][] vis, int row, int col){
        Queue<Pair> que = new LinkedList<Pair>();
        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = true;
        que.add(new Pair(row, col));
        
        int[] r = {-1,1,0,0};
        int[] c = {0,0,-1,1};
        while(!que.isEmpty()){
            int i = que.peek().first;
            int j = que.peek().second;
            que.remove();
            for(int ch = 0; ch < 4 ; ch++){
                int rc = i + r[ch];
                int cc = j + c[ch];

                if(rc >=0 && rc < n && cc >=0 && cc < m
                    && grid[rc][cc] == '1' && vis[rc][cc] == false){
                        vis[rc][cc] = true;
                        que.add(new Pair(rc, cc));
                }
            }
        }
    }
}