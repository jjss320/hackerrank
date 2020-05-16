package prac1;

public class Testpro {

	public static void main(String[] args) {
		int[] prices = {3, 2, 4, 8, 7};
		int result = solution(prices);
		System.out.println(result);
	}
	
	public static int solution(int[] prices) {
		//풀이 코드
		int a;
		int b;
		int result = 0;
		int cal;
		
		for(int i = 0; i < prices.length; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				cal = prices[j] - prices[i];
				if(result < cal) {
					result = cal;
					a = prices[i];
					b = prices[j];
				}
			}
		}
		return result;
	}

}
