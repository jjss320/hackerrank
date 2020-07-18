package prac1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {
    static String isBalanced(String s) {
    	// 초기값 설정
    	char[] c = s.toCharArray();
    	Stack stackA = new Stack();
    	String result = "YES";
    	int count = 0;
    	char popA;
    	// 전체 개수 홀수 시 NO return
    	if(c.length % 2 == 1) {
    		result = "NO";
    		return result;
    	}
    	// 열린 괄호들은 스택에 닫힌 괄호 나올 시 스택 pop 후에 서로 계산
    	while(count < c.length) {
    		if(c[count] == '(' || c[count] == '{' || c[count] == '[') {
    			stackA.push(c[count]);
    		}
    		if(c[count] == ')' || c[count] == '}' || c[count] == ']') {
    			// 열린 괄호 없는 상태에서 닫힌 괄호 나올 시 NO return
    			if(stackA.empty() == true) {
    				result = "NO";
    				break;
    			}
    			// 아스키코드로 계산
    			popA = (char) stackA.pop();
    			int cal = Math.abs(popA - c[count]);
    			if((1 == cal || cal == 2) != true) {
    				result = "NO";
    				break;
    			}
    		}
    		count++;
    	}
    	// 연산 끝난 후에도 스택에 값 남을 시 NO return
    	if(stackA.empty() == false) {
    		result = "NO";
    	}
    	
    	return result;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            String s = scanner.nextLine();
//
//            String result = isBalanced(s);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
    	String s = "[{";
    	String result = isBalanced(s);
    	System.out.println(result);
    }
}
