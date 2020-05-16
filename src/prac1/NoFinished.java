package prac1;

import java.util.HashMap;

public class NoFinished {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		String result;
		result = solution(participant, completion);
		
		System.out.println(result);
	}

	public static String solution(String[] participant, String[] completion) {        
        String answer = "";
        boolean btn;
        
		HashMap<String, Integer> hashTbl = new HashMap<>();
        
        for(int i = 0; i < completion.length; i++) {
        	String key = completion[i];
        	
        	if(hashTbl.containsKey(key))
        		hashTbl.put(key, hashTbl.get(key) + 1);
        	else
        		hashTbl.put(key, 1);
        }
        
        for(int j = 0; j < participant.length; j++) {
        	String key = participant[j];
        	
        	btn = hashTbl.containsKey(key);
        	if(btn == false) {
        		answer = key;
        		
        	} else {
        		hashTbl.put(key, hashTbl.get(key) - 1);
        		if(hashTbl.get(key) < 0) {
        			answer = key;
        		}
        	}
        }
        
        return answer;
    }
}