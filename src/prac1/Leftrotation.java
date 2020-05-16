package prac1;

import java.util.Scanner;

public class Leftrotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
        
        int t = 0;
        
        for(int i=0; i<d; i++) {
        	t = a[0]; // t=1
        	
        	for(int j=0; j<a.length-1; j++) {
        		a[j] = a[j+1];
        	}
        	
        	a[n-1] = t;
        }
        
        for(int x=0; x < a.length; x++) {
        	System.out.print(a[x]);
        	if(x != a.length) {
        		System.out.print(" ");
        	}
        }
    }
}