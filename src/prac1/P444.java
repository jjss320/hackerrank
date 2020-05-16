package prac1;

import java.util.Arrays;

public class P444 {
	public static void main (String[] args) {
	    //int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		int[] numbers = { 1, 2, 3, 4, 7, 8, 9 };
	    //printPairs(numbers, 7);
	    printPairs(numbers, 8);
	  }
	  
	public static void printPairs(int[] arr, int sum) {
	    System.out.printf("A: %s\n", Arrays.toString(arr));
	    System.out.printf("N: %d\n", sum);
	    System.out.println("========================");
	    /* 해당 메소드를 완성하시오. */
	    Arrays.parallelSort(arr);
	// 1 3 4 5 7 8 9 / 8
	    int i = 0;
	    int j = arr.length-1;
	    while(i<j) {
	    	int tmp = arr[i] + arr[j];
	    	if(tmp == sum){
    			System.out.println("(" + arr[i] + ", " + arr[j] + ")");
    		}
	    	if(tmp < sum){
	    		i++;
	    	} else {
	    		j--;
	    	}
	    }
//	    while(i<j) {
//	    	if(arr[i] + arr[j] <= sum){
//	    		if(arr[i] + arr[j] == sum){
//	    			System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//	    		}
//	    		i++;
//	    	} else {
//	    		j--;
//	    	}
//	    }
	}
}
