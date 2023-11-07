package practice;

public class Solution {
    public int findTheChampion(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            boolean isChampion = true;

            for (int j = 0; j < n; j++) {
                if (i != j && grid[i][j] == 1) {
                    isChampion = false;
                    break;
                }
            }

            if (isChampion) {
                return i-1;
            }
        }

        return -1; // If no champion is found, you can return -1 or any other appropriate value.
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0, 1}, {0, 0}};
        Solution solution = new Solution();
        int champion1 = solution.findTheChampion(grid1);
        System.out.println("The champion is team " + champion1);

//        int[][] grid2 = {{0, 0, 1}, {1, 0, 1}, {0, 0, 0}};
//        int champion2 = solution.findTheChampion(grid2);
//        System.out.println("The champion is team " + champion2);
    }


}






























/*
* 1, 8, 6, 2, 5, 4, 8, 3, 7
*
* 0: 8 -> 1,2,3,4,5,6,7,8
* 1: 7 -> 6,4,15,16,40,18,49
* 2: 6 -> 2,10,12,24,15,36
* 3: 5 -> 2,4,6,8,10
* 4: 4 -> 4,10,9,20
* 5: 3 -> 4,6,12
* 6: 2 -> 3,14
* 7: 1 -> 3
* 8: 0 -> 0
*
* */

