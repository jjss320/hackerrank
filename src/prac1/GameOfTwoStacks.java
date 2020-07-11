package prac1;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GameOfTwoStacks {
    /*
     * Complete the twoStacks function below.
     */
	static int twoStacks(int x, int[] a, int[] b) {
    	int sum = 0;
    	int count = 0;
        int ai = 0;
        int bi = 0;
        int max = 0;
        
    	while(sum <= x) {
    		sum += a[ai];
    		if(sum > x) {
    			sum -= a[ai];
    			ai -= 1;
    			break;
    		}
        	count += 1;
        	ai += 1;
        	if(ai >= a.length) {
        		ai -= 1;
        		break;
        	}
    	}
    	
    	while(sum <= x) {
    		sum += b[bi];
    		if(sum > x) {
    			sum -= b[bi];
    			break;
    		}
    		count += 1;
    		bi += 1;
    		if(bi >= b.length) {
        		bi -= 1;
        		break;
        	}
    	}

		if(max <= count) {
			max = count;
		}
    	
    	while(ai >= 0) {
    		sum -= a[ai];
    		count -= 1;
    		
    		while(sum <= x) {
        		sum += b[bi];
        		if(sum <= x) {
            		count += 1;
        		}
        		else if(sum > x) {
        			sum -= b[bi];
        			break;
        		}
        		bi += 1;
        		if(bi >= b.length) {
            		bi -= 1;
            		break;
            	}
        	}
    		ai -= 1;
    		if(max <= count) {
    			max = count;
    		}
    	}

    	return max;
    	
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int g = Integer.parseInt(scanner.nextLine().trim());
//
//        for (int gItr = 0; gItr < g; gItr++) {
//            String[] nmx = scanner.nextLine().split(" ");
//
//            int n = Integer.parseInt(nmx[0].trim());
//
//            int m = Integer.parseInt(nmx[1].trim());
//            int x = Integer.parseInt(nmx[2].trim());
            int x = 25;
//            int[] a = new int[n];
            int[] a = {1, 0, 0, 0, 1 ,0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 ,0, 1 ,1, 1 ,0 ,0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0};
//            String[] aItems = scanner.nextLine().split(" ");
//
//            for (int aItr = 0; aItr < n; aItr++) {
//                int aItem = Integer.parseInt(aItems[aItr].trim());
//                a[aItr] = aItem;
//            }

//            int[] b = new int[m];
            int[] b = {1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1 ,1 ,0 ,1, 1, 0, 1, 1, 1, 0, 1, 1, 0 ,0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1};
//            String[] bItems = scanner.nextLine().split(" ");
//
//            for (int bItr = 0; bItr < m; bItr++) {
//                int bItem = Integer.parseInt(bItems[bItr].trim());
//                b[bItr] = bItem;
//            }

            int result = twoStacks(x, a, b);
            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
    }
}