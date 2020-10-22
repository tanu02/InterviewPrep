package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution {

	List<Integer[]> storeList = new ArrayList<>();
	List<Integer[]> buildList = new ArrayList<>();
	List<Integer[]> outputList = new ArrayList<>();

	int row = 0, col = 0, k = 0;

	public int solution(int K, int[][] A) {

		if (A == null || A.length == 0 || A[0].length == 0)
			return 0;

		this.row = A.length;
		this.col = A[0].length;
		this.k = K;

		createBuiltList(A);

		for (int i = 0; i < buildList.size(); i++) {
			findStoreLoc(buildList.get(i)[0], buildList.get(i)[1], 0);
		}
		
		removeDuplicates();
		findNearestLoc();
		return outputList.size();
		
	}
	
	private void removeDuplicates() {
		Integer[] arr;
		
		for(int i  = 0 ; i < storeList.size(); i++) {
			arr = storeList.get(i);
			
			for(int j = i+1; j < storeList.size() && j < storeList.size(); j++) {
				if(!(storeList.get(j)[0] == arr[0] && storeList.get(j)[1] == arr[1])) {
					storeList.remove(i);
				}
			}
		}
	}

	private void findNearestLoc() {

		Integer[] pos; Integer[] existLoc;
		int  x = 0, y = 0;
		boolean isNearest = true; 
		for (int i = 0; i < storeList.size(); i++) {

			pos = storeList.get(i);
			x = 0; y = 0;
			
			for (int j = 0; j < buildList.size(); j++) {
				existLoc = buildList.get(j);
				x = existLoc[0] - pos[0];
				y = existLoc[1] - pos[0];
					
				if(x < 0) x *= -1;
				if(y < 0) y *= -1;
				
				if(x + y > k) {
					isNearest = false;
					break;
				}
			}
			
			if(!isNearest) {
				storeList.remove(i);
			}
			
		}
	}

	private void findStoreLoc(int i, int j, int dis) {
		if (i < 0 || i == row || j < 0 || j == col)
			return;
		if (dis > k)
			return;

		if (!isAlreadyBuild(i, j)) {

			Integer[] arr = new Integer[2];
			arr[0] = i;
			arr[1] = j;
			storeList.add(arr);
		}

		findStoreLoc(i + 1, j, dis + 1);
		findStoreLoc(i - 1, j, dis + 1);
		findStoreLoc(i, j + 1, dis + 1);
		findStoreLoc(i, j - 1, dis + 1);

	}

	private boolean isAlreadyBuild(int i, int j) {
		Integer[] arr;
		for (int m = 0; m < buildList.size(); m++) {
			arr = buildList.get(m);

			if (arr[0] == i && arr[1] == j)
				return true;
		}
		return false;
	}

	private void createBuiltList(int[][] A) {

		Integer[] pos;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {

				if (A[i][j] == 1) {
					pos = new Integer[2];
					pos[0] = i;
					pos[1] = j;
					buildList.add(pos);

				}
			}
		}

	}

}