package prac1;

import java.util.Arrays;

public class KthSmallest {
	public static void main (String[] args) {
	    // 변수 생성
	    int[] input = { 12, 3, 5, 7, 19, 43 };
	    System.out.printf("배열: %s\n", Arrays.toString(input).replaceAll("\\[|\\]|,", ""));

	    // 계산
	    int k = 3;
	    int result = kthSmallestNumber(input, k);
	    
	    // 결과 출력
	    System.out.printf("k = %d일 때, k번째 작은 수: %d", k, result);
	  }
	  
	  public static int kthSmallestNumber(int[] numbers, int kth) {
	    /* 해당 메소드를 완성하시오. */
	    int n = 1;
	    for(int i = 0; i < numbers.length; i++){
	      if(kth < numbers[i]){
	        n = n + 1;
	      }
	    }
	    return n;
	  }
}
