package prac1;

public class TargetNum {

	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		int output;
		
		output = solution(numbers, target);
		
		System.out.println(output);
	}

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        int result = 0;
    
    	for(int i=0; i<numbers.length; i++){
            
        	numbers[i] = numbers[i]*(-1);
        	
        	for(int j=0; j<numbers.length; j++){
                result = result + numbers[j];
            }
        	if(result==target){
                answer = answer + 1;
            }
            result = 0;
	        }
        
        return answer;
    }
}