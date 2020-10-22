package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer[]> uniqueList = new ArrayList<>();
		Integer arr[] = new Integer[1];
		arr[0] = 1;
		uniqueList.add(arr);
		
		
		for(int i = 0; i < uniqueList.size(); i++) {
			if(uniqueList.get(0)[0] == 1) {
				uniqueList.remove(i);
			}
		}
	}

}
