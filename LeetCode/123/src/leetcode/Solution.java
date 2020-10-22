package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	int SIZE = 2;

	public int maxProfit(int[] prices) {

		int profit = 0;

		List<Integer> list = new ArrayList<>(SIZE);
		int i = 0; int j = 0;
		
		while(i < prices.length && j < prices.length) {
			
			while(i < prices.length -1) {
				if(prices[i + 1] > prices[i]) break;
				i++;
			}
			
			if(i == prices.length - 1) return list.stream().collect(Collectors.summingInt(Integer :: intValue)); 
			
			j = i + 1;
			
			while(j < prices.length - 1) {
				if(prices[j + 1] < prices[j]) break;
				j++;
			}
			
			profit =  prices[j] - prices[i];
			addInList(list,profit);
			i = j + 1;
			
		}
	
		return list.stream().collect(Collectors.summingInt(Integer :: intValue));

	}

	private void addInList(List<Integer> list, int profit) {
		if (list.size() == SIZE)
				removeMin(list);

		list.add(profit);
	}

	private void removeMin(List<Integer> list) {
		Integer min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min)
				min = list.get(i);
		}
		list.remove(min);
	}

}
