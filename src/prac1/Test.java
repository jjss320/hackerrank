package prac1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] result = null;
		
		result = solution(answers);

		for(int j = 0; j < result.length; j++) {
			System.out.print(result[j]);
		}
	}
	
	public static int[] solution(int[] answers) {
        int[] answer = new int[answers.length];
        
        int[] a = new int[answers.length];
        int[] b = new int[answers.length];
        int[] c = new int[answers.length];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int x = 0; x < answers.length; x++) {
        	if(x % 5 == 0) {
        		a[x] = 1;
        	}
        	else if(x % 5 == 1) {
        		a[x] = 2;
        	}
        	else if(x % 5 == 2) {
        		a[x] = 3;
        	}
        	else if(x % 5 == 3) {
        		a[x] = 4;
        	}
        	else {
        		a[x] = 5;
        	}
        }
        
        for(int y = 0; y < answers.length; y++) {
        	if(y % 8 == 0 || y % 8 == 2 || y % 8 == 4 || y % 8 == 6) {
        		b[y] = 2;
        	}
        	else if(y % 8 == 1) {
        		b[y] = 1;
        	}
        	else if(y % 8 == 3) {
        		b[y] = 3;
        	}
        	else if(y % 8 == 5) {
        		b[y] = 4;
        	}
        	else {
        		b[y] = 5;
        	}
        }

        for(int z = 0; z < answers.length; z++) {
        	if(z % 10 == 0 || z % 10 == 1) {
        		c[z] = 3;
        	}
        	else if(z % 10 == 2 || z % 10 == 3) {
        		c[z] = 1;
        	}
        	else if(z % 10 == 4 || z % 10 == 5) {
        		c[z] = 2;
        	}
        	else if(z % 10 == 6 || z % 10 == 7) {
        		c[z] = 4;
        	}
        	else {
        		c[z] = 5;
        	}
        }
        
        for(int i = 0; i < answers.length; i++){
        	if(answers[i] == a[i]){
        		count1 = count1 + 1;
        	}
        	if(answers[i] == b[i]){
        		count2 = count2 + 1;
        	}
        	if(answers[i] == c[i]){
        		count3 = count3 + 1;
        	}else {
        		
        	}
        }
        
        if(count1 == count2 && count2 == count3 && count1 == count3) {
        	answer[0] = 1;
        	answer[1] = 2;
        	answer[2] = 3;
        }
        else if(count1 > count2 && count1 > count3) {
        	answer[0] = 1;
        }
        else if(count2 > count1 && count2 > count3) {
        	answer[0] = 2;
        }
        else if(count3 > count1 && count3 > count2) {
        	answer[0] = 3;
        }
        
        else if(count1 == count2 && count1 > count3) {
        	answer[0] = 1;
        	answer[1] = 2;
        }
        else if(count1 == count3 && count1 > count2) {
        	answer[0] = 1;
        	answer[1] = 3;
        }
        else if(count2 == count3 && count2 > count1) {
        	answer[0] = 2;
        	answer[1] = 3;
        }
        
        
        
        // ArrayList : type[]
        // Integer : int
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<answer.length; i++) {
        	if(answer[i] != 0)
        		list.add(answer[i]);
        }
        int[] re = new int[list.size()];
        for(int i=0; i<re.length; i++) {
        	re[i] = list.get(i);
        }
        
        return re;
    }

}
