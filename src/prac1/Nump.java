package prac1;

public class Nump {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = null;
		
		result = solution(array, commands);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println("result[" + i + "] = " + result[i]);
		}
		
	}

    public static int[] solution(int[] array, int[][] commands) {
        int start = 0;
        int end = 0;
        int k = 0;
        int temp = 0;
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            start = commands[i][0];
            end = commands[i][1];
            k = commands[i][2];	//각 순서마다 갱신
            int k2 = start + k - 2;
            
            if(start == end){
                answer[i] = array[start];
                continue;
            }
            
            for(int x = start - 1; x < end-1; x++){
                for(int y = x + 1; y < end; y++){
                    if(array[x] > array[y]){
                        temp = array[x];
                        array[x] = array[y];
                        array[y] = temp;
                    }
                }
            }
            
            answer[i] = array[k2];
        }
        return answer;
    }
}
