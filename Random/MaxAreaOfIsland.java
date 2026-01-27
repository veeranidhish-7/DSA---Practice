package Random;

public class MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int visited[][] = new int[rows][cols];
        int max_area = 0;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    max_area = Math.max(max_area,dfs(i,j,grid,visited,rows,cols));
                }
            }
        }
        return max_area;
    }

    public static int dfs(int row, int col,int[][] grid, int[][] visited, int rows, int cols){
        if(row >= rows || row < 0 || col < 0 || col >= cols || grid[row][col] != 1 || visited[row][col] == 1 ){
            return 0;
        }

        visited[row][col] = 1;

        return 1 + dfs(row+1,col,grid,visited,rows,cols) + dfs(row-1,col,grid,visited,rows,cols) + dfs(row,col+1,grid,visited,rows,cols) + dfs(row,col-1,grid,visited,rows,cols);
    }

    public static void main(String[] args) {
        int grid[][] = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
