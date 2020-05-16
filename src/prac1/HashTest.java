package prac1;

//import java.util.HashMap;
import java.util.Hashtable;

public class HashTest {
	public static void main(String[] args) {
		//style1
		
		boolean[] hashTbl = new boolean[100000];
        hashTbl["leo".hashCode()%100000] = true;
        hashTbl["kiki".hashCode()%100000] = true;
        hashTbl["eden".hashCode()%100000] = true;
        
        System.out.println("leo".hashCode()%100000);
        System.out.println(hashTbl["leo".hashCode()%100000]);
        System.out.println(hashTbl[0]);
        System.out.println();
        
        //style2
        
        //HashMap<String, Boolean> hashTbl2 = new HashMap<>();
        Hashtable<String, Boolean> hashTbl2 = new Hashtable<>();
        hashTbl2.put("leo", true);
        hashTbl2.put("kiki", true);
        hashTbl2.put("eden", true);
        
        System.out.println(hashTbl2.get("leo"));
        System.out.println(hashTbl2.containsKey("lee"));
	}
}
