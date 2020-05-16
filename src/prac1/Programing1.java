package prac1;

import java.util.Stack;

public class Programing1 {

	public static void main(String[] args) {
		int[][] board = new int[][] {
			{0,0,0,0,0}, 
			{0,0,1,0,3},
			{0,2,5,0,1},
			{4,2,4,4,2},
			{3,5,1,3,1}};
		//int[] moves = new int[] {1,5,3,5,1,2,1,4};
		int[] moves = new int[] {1,4,1,4};
		
		int result;
		
		result = solution(board, moves);
		
		System.out.println(result);
	}
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int a = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i=0;i<moves.length;i++){
            
        	int count = 0;
            
    		while(count<board.length){
                if(board[count][moves[i]-1]!=0){
                    stack.push(board[count][moves[i]-1]);
                    board[count][moves[i]-1]=0;
                    break;
                }
                count = count + 1;
            }
                     
            if(count!=board.length) {            	
            	if(a>0 && stack.elementAt(a-1)==stack.elementAt(a)) {
            		stack.pop();
            		stack.pop();
            		answer = answer + 2;
            		a = a - 2;
            	}
            	a=a+1;
            }
    	}
        return answer;
    }
}

