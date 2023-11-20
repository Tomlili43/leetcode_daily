import java.util.ArrayList;
import java.util.Arrays;


public class MinPathSum {
    private int minPathSum(ArrayList<ArrayList<Integer>> maze){
        // get the size of the maze
        int m = maze.size();
        int n = maze.get(0).size();
        // traverse
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                // if it is the first row
                if(i == 0 && j != 0){
                    maze.get(i).set(j, maze.get(i).get(j) + maze.get(i).get(j-1));
                }
                // if it is the first column
                else if(i != 0 && j == 0){
                    maze.get(i).set(j, maze.get(i).get(j) + maze.get(i-1).get(j));
                }
                // if it is not the first row and column
                else if(i != 0 && j != 0){
                    maze.get(i).set(j, maze.get(i).get(j) + Math.min(maze.get(i-1).get(j), maze.get(i).get(j-1)));
                }
            }
        }
        return maze.get(m-1).get(n-1);
    }

    public int minPathSum(int[][] maze) {
        // core three equal
        // i==0 maze[i][j] = maze[i][j-1]+maze[i][j]
        // j==0 maze[i][j] = maze[i-1][j]+maze[i][j]
        int m = maze.length;
        int n = maze[0].length;
        for(int i =0;i<m;i++){
            for (int j = 0;j<n;j++) {
                if(i==0&& j==0) continue;
                else if(i==0) maze[i][j] = maze[i][j-1]+maze[i][j];
                else if(j==0) maze[i][j] = maze[i-1][j]+maze[i][j];
                else maze[i][j] = Math.min(maze[i][j-1]+maze[i][j],maze[i-1][j]+maze[i][j]);
            }
        }
        return maze[m-1][n-1];
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> maze = new ArrayList<ArrayList<Integer>>();
        maze.add(new ArrayList<Integer>(Arrays.asList(1,3,1)));
        maze.add(new ArrayList<Integer>(Arrays.asList(1,5,1)));
        maze.add(new ArrayList<Integer>(Arrays.asList(4,2,1)));
        int [][] maze2 = {{1,3,1},{1,5,1},{4,2,1}};
        //  print size
        System.out.println(maze2.length);
        System.out.println(maze2[0].length); 
    }
}
