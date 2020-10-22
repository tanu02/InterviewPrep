package leetcode;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		int[] prices = {3,3,5,0,0,3,1,4} //6
;		int[] prices1 = {1,2,3,4,5}; //4
		int[] prices2 = {7,6,4,3,1}; //0
		int[] prices3 =  {1,2,4,2,5,7,2,4,9,0}; //13
	//	System.out.println(sol.maxProfit(prices));
		//System.out.println(sol.maxProfit(prices1));
		//System.out.println(sol.maxProfit(prices2));
		System.out.println(sol.maxProfit(prices3));

	}

}
