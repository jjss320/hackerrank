package prac1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LargestRectangle {
    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
    	
    	Stack stack = new Stack();
    	int width = 0;
    	int max = 0;
    	int result = 0;
    	
    	for(int height = 0; height < h.length; height++) {
    		for(int j = 0; j < h.length; j++) {
    			if(h[height] <= h[j]) {
    				width++;
    				if(j == h.length - 1) {
    					if(max <= width) {
    						max = width; 
    					}
    					width = 0;
    				}
    			} else {
    				if(width >= max) {
    					max = width;
    				}
    				width = 0;
    			}
    		}
    		stack.push(h[height] * max);
    		max = 0;
    	}
    	
    	while(stack.empty() == false) {
    		int temp = (int) stack.pop();
    		
    		if(temp >= result) {
    			result = temp;
    		}
    	}
    	return result;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int[] h = new int[n];

//        String[] hItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int hItem = Integer.parseInt(hItems[i]);
//            h[i] = hItem;
//        }
int[] h = {6320, 6020, 6098, 1332, 7263, 672, 9472, 2838, 3401, 9494};
        long result = largestRectangle(h);
System.out.println(result);//18060
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

//        scanner.close();
    }
}
