public class Q4_5 {

    public static int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    exploreIsland(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void exploreIsland(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        exploreIsland(grid, row + 1, col); 
        exploreIsland(grid, row - 1, col); 
        exploreIsland(grid, row, col + 1); 
        exploreIsland(grid, row, col - 1); 
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        int islandCount = countIslands(grid);
        System.out.println("Number of islands: " + islandCount);
    }
}
