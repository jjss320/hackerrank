package prac1;

import java.util.Arrays;

public class KthSmallest {
	public static void main (String[] args) {
	    // ���� ����
	    int[] input = { 12, 3, 5, 7, 19, 43 };
	    System.out.printf("�迭: %s\n", Arrays.toString(input).replaceAll("\\[|\\]|,", ""));

	    // ���
	    int k = 3;
	    int result = kthSmallestNumber(input, k);
	    
	    // ��� ���
	    System.out.printf("k = %d�� ��, k��° ���� ��: %d", k, result);
	  }
	  
	  public static int kthSmallestNumber(int[] numbers, int kth) {
	    /* �ش� �޼ҵ带 �ϼ��Ͻÿ�. */
	    int n = 1;
	    for(int i = 0; i < numbers.length; i++){
	      if(kth < numbers[i]){
	        n = n + 1;
	      }
	    }
	    return n;
	  }
}
