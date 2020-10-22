package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		System.out.println(noOfWaysToDrawTheGame(6));
	}
	
	static int count = 0; 
	static int[] options = {2, 4, 6, 8};
    static int noOfWaysToDrawTheGame(int totalScore) {
    	
    	 dfs(totalScore);
    	 return count; 
    }
    
    private static boolean dfs(int score) {
    	if(score == 0) return true; 
    	if(score < 0) return false; 
    	
    	for(int opt : options) {
    		if(dfs(score - opt)) {
    			count++;
    			break;
    		}
    	}
    	return false; 
    }
	
}