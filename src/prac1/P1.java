package prac1;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		
    // 1. set result
    // result = new List<Integer>()
    	List<Integer> result = new ArrayList<Integer>();
    	
    // 2. set variable
    // lastAnswer = 0;
    // seqList = new ArrayList<List<Integer>>()
    	int lastAnswer = 0;
    	List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    // List<List<Integer>> seqList2 = new LinkedList<List<Integer>>();
    // List<Integer> arr = new ArrayList<>();
    // List<HashMap<String, List<Nump>>> arr2 = new ArrayList<>();
    	for(int i=0; i<n; i++) {
    		seqList.add(new ArrayList<Integer>());
    	}
    	
    	
    	// 3. process
    	// if(type == 1) { .. }
    	// else { ..result.add(lastAnswer) ... }
    	// return result;
    	for(int i=0; i<queries.size(); i++) {
    		
    		int type = queries.get(i).get(0);
    		int x = queries.get(i).get(1);
    		int y = queries.get(i).get(2);
    		int cal = (x ^ lastAnswer) % n;
    		
    		if(type == 1) {
    			seqList.get(cal).add(y);
    		}
    		if(type == 2) {
    			lastAnswer = seqList.get(cal)
    						.get(y % seqList.get(cal).size());
    			result.add(lastAnswer);
    		}
    	}
    	
    	return result;
        
    }

}

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
