package prac1;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	Stack stack = new Stack();
    	String S = "";
    	int count = scan.nextInt();
    	int Q = 0;
    	
    	// count가 소멸될 때 까지 실행
    	while(count > 0) {
    		Q = scan.nextInt();
    		
    		if(Q == 1) {
    			S = S + scan.next();
    			stack.push(S);
    			count--;
    		}	
    		
    		else if(Q == 2) {
    			int tempd = scan.nextInt();

    			if(tempd < S.length()) {
    				S = S.substring(0, S.length() - tempd);
    			}
    			else if(tempd == S.length()){
    				S = "";
    			}
    			
    			stack.push(S);
    			count--;
    		}
    		
    		else if(Q == 3) {
    			int tempn = scan.nextInt();
    			if(S.length() >= tempn && tempn > 0) {
    				System.out.println(S.charAt(tempn-1));	
    			}
    			count--;
    		}
    		// 스택에 이전값 꺼내와서 돌아가기
    		else if(Q == 4) {
    			if(stack.empty() == false) {
    				stack.pop();
    				if(stack.empty() == false) {
    					String back = (String) stack.pop();
    					S = back;
    					stack.push(back);
    				}
    				else {
    					S = "";
    				}
    			}
    			count--;
    		}
    		
    		// 1부터 4이외에 값 입력 시
    		else {
    			
    		}
    	}
    	
    }
}