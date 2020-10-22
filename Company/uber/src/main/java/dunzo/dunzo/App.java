package dunzo.dunzo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
//        DunzoBiz biz = new DunzoBiz();
//       // int[] arr = new int[]{  1, 1, 1};
//        //int m = 2;
//        
//        int[] arr = new int[] [9, 7, 7, 9, 3];
//        int m = 3;
//        
//        int max = biz.maxMinInSegments(arr, m);
//        System.out.println("max - " + max);

    	
    	int[] a = new int[]{ 7, 5, 9};
    	int[] b = new int[]{ 13, 1, 4};
    	int  d = 3;
    	
    	UberBiz biz = new UberBiz();
    	int count = biz.reductorArray(a, b, d);
    	System.out.println(count);
    }
    
    
}
