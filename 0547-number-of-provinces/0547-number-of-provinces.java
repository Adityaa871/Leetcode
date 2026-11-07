class Solution {
    public int findCircleNum(int[][] adj) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int n = adj.length;
        for(int i=0; i<n; i++){
            ls.add(new ArrayList<Integer>());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(adj[i][j] == 1 && i != j){
                    ls.get(i).add(j);
                    ls.get(j).add(i);
                }
            }
        }
        int [] vis = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            if(vis[i] == 0){
                count++;
                dfs(i, ls, vis);
            }
        }
        return count;
    }
    public void dfs(int i, ArrayList<ArrayList<Integer>> ls, int [] vis){
        vis[i] = 1;
        for(Integer x: ls.get(i)){
            if(vis[x] == 0){
            dfs(x, ls, vis);
            }
        }
    }
}