package prac1;

import java.util.Arrays;

public class BinarySearch {
  public static void main (String[] args) {
    // 테스트 배열
    int[][] test = {
      { 1, 3, 5, 7, 9, 11, 13, 15, 17 },
      { 2, 17, 19, 22, 25, 27, 28, 33, 37 }
    };
  
    // 테스트 수행  
    for (int[] input : test) {
      System.out.printf("%s 배열에 %s이 있나요? %b\n", Arrays.toString(input), 33, contains(input, 33));
    }
  }
  
  public static boolean contains(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length - 1) >= 0;
  }
  
  // 정수 배열에서 검색 값을 찾으면 해당 인덱스를 반환
  private static int binarySearch(int[] arr, int target, int low, int high) {
    /* 이진 탐색 알고리즘을 활용하여 해당 메소드를 완성하시오. */
	while(low < high){
	    
		int mid = (low+high)/2;
		
		if(arr[mid]==target){
			  return mid;
		}
		
	    if (target < arr[mid]) {
	      high = mid - 1;
	    } else {
	      low = mid + 1;
	    }	    
	}
	return -1;
  }
}