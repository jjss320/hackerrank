package prac1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
    	
    	int[] answer = new int[queries.length];
    	
    	for(int i=0; i<queries.length;i++) {
    		int count = 0;
    		String temp = queries[i];
    		
    		for(int j=0; j<strings.length; j++) {
    			if(strings[j].equals(temp)) {
    				count = count + 1;
    			}
    		}
    		answer[i] = count;
    	}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int stringsCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] strings = new String[stringsCount];
//
//        for (int i = 0; i < stringsCount; i++) {
//            String stringsItem = scanner.nextLine();
//            strings[i] = stringsItem;
//        }
//
//        int queriesCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] queries = new String[queriesCount];
//
//        for (int i = 0; i < queriesCount; i++) {
//            String queriesItem = scanner.nextLine();
//            queries[i] = queriesItem;
//        }
    	String[] strings = {"aba","baba","aba","xzxb"};
    	String[] queries = {"aba","xzxb","ab"};
    	
        int[] res = matchingStrings(strings, queries);
        
        for(int i=0; i<res.length; i++) {
        	System.out.println(res[i]);
        }
//
//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
