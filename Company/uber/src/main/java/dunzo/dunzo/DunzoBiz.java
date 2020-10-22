package dunzo.dunzo;

public class DunzoBiz {

	int maxMinInSegments(int[] arr, int m) {
		
		if(arr.length == 1) return  arr[0];
		if(m > arr.length) return findMin(arr, 0, arr.length);

		int min = 0, max = 0;

		for (int i = 0; i <= arr.length - m; i++) {
			min = findMin(arr, i, m);
			
			System.out.println("Window - " + i + " min - " + min);
			
			if (min > max)
				max = min;

		}

		return max;

	}

	private int findMin(int[] arr, int st, int m) {
		int min = arr[st];

		for (int i = st; i < st + m; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

}
