package leetcode;

import java.util.Arrays;
import java.util.List;

class Solution {

	static int ROW, COL, count = 0; 
	static Integer[][] arr; 
	 static List<int[]> directions = Arrays.asList(
			new int[] { 0, 1 },
			new int[] { 1, 1 },
			new int[] { 1, 0 },
			new int[] { 1, -1 },
			new int[] { 0, -1 },
			new int[] { -1, -1 },
			new int[] { -1, 0 },
			new int[] { -1, 1 }	
		);
	 static Integer[][]dp ;
	static int countConnections(List<List<Integer>> matrix) {
	
		Integer[][] arr1 = matrix.stream()
			    .map(l -> l.stream().toArray(Integer[]::new))
			    .toArray(Integer[][]::new);
		
		if(arr1 == null || arr1.length == 0 || arr1[0].length == 0)
			return 0; 
		arr = arr1; 
		
		ROW = arr.length; 
		COL = arr[0].length; 
		
		dp = new Integer[ROW][COL];
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				dp[i][j] = -1;
			}
		}
		
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COL; j++) {
				dfs(i, j);
			}
		}
		return count; 
	}
	
	private static boolean dfs(int i, int j) {
		if(i < 0 || i == ROW || 
				j < 0 || j == COL ||
						arr[i][j] == 0 ||
						arr[i][j] == 2
				) return false;
		
		if(dp[i][j] != -1) return true; 
		
		arr[i][j] = 2;
		for (int[] direct : directions) {
			if(dfs(i + direct[0], j + direct[1])) count++;
		}
		arr[i][j] = 1; 
		dp[i][j] = count; 
		return true; 
		
	}
}