package dunzo.dunzo;

public class UberBiz {

	public int reductorArray(int[] a, int[] b, int d) {

		int diff = 0;
		int count = 0;
		int flag = 0;

		for (int i = 0; i < a.length; i++) {
			flag = 0;
			for (int j = 0; j < b.length; j++) {
				diff = a[i] - b[j];
				if(diff < 0) diff = diff * -1;
				
				if (diff <= d) {
					flag = 1;
					break;
				}
			}
			if (flag == 0)
				count++;
		}

		return count;
	}

}
