public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid==null||grid.length==0) return 0;
        int m=grid.length,n=grid[0].length,count=0;
        for (int i=0;i<m;i++) for (int j=0;j<n;j++) {
            if (grid[i][j]=='1') { count++; dfs(grid,i,j,m,n); }
        }
        return count;
    }
    private void dfs(char[][] g, int i, int j, int m, int n) {
        if (i<0||j<0||i>=m||j>=n||g[i][j]!='1') return;
        g[i][j]='0';
        dfs(g,i+1,j,m,n); dfs(g,i-1,j,m,n); dfs(g,i,j+1,m,n); dfs(g,i,j-1,m,n);
    }
}
