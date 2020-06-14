package com.datastructure.algorithm.week04;

/**
 * 岛屿数量
 */
public class NumIsLands {
    static void dfs(int[][] grid, int r, int c) {
        // 网格行
        int nr = grid.length;
        // 网格列
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == 0) {
            return;
        }

        // 初始化当前格为0，表示已经遍历过
        grid[r][c] = 0;
        // 遍历上下左右四个
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        // 获取网格的行数和列数
        int nr = grid.length;
        int nc = grid[0].length;
        // 定义岛屿的数量
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == 1) {
                    // 岛屿数量加一
                    ++num_islands;
                    // 深度优先遍历是所有元素变为0
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }

    public static void main(String[] args) {
        int[][] a = {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        int i = numIslands(a);
        System.out.println(i);
    }
}
