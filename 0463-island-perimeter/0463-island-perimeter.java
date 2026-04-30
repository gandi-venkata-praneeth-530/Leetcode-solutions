class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands=0,neigh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    islands++;
                    if(i+1<rows && grid[i+1][j]==1){
                        neigh++;
                    }
                    if(j+1<cols && grid[i][j+1]==1){
                        neigh++;
                    }
                }
            }
        } 
        return 4*islands - 2*neigh;
    }
}