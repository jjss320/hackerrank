package prac1;

import java.util.Arrays;

public class BinarySearch {
  public static void main (String[] args) {
    // �׽�Ʈ �迭
    int[][] test = {
      { 1, 3, 5, 7, 9, 11, 13, 15, 17 },
      { 2, 17, 19, 22, 25, 27, 28, 33, 37 }
    };
  
    // �׽�Ʈ ����  
    for (int[] input : test) {
      System.out.printf("%s �迭�� %s�� �ֳ���? %b\n", Arrays.toString(input), 33, contains(input, 33));
    }
  }
  
  public static boolean contains(int[] arr, int target) {
    return binarySearch(arr, target, 0, arr.length - 1) >= 0;
  }
  
  // ���� �迭���� �˻� ���� ã���� �ش� �ε����� ��ȯ
  private static int binarySearch(int[] arr, int target, int low, int high) {
    /* ���� Ž�� �˰����� Ȱ���Ͽ� �ش� �޼ҵ带 �ϼ��Ͻÿ�. */
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