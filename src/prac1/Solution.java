package prac1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
//
//    // Complete the reverseArray function below.
//	static int[] reverseArray(int[] a) {
//        int count = 0; 
//
//        int[] tempA = new int[a.length];
//
//        for(int i=a.length-1; i>=0; i--){
//            tempA[count]=a[i];
//            count=count+1;
//        } 
//        return tempA;
//    }
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] arr = new int[arrCount];
//
//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }
//
//        int[] res = reverseArray(arr);
//
//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(String.valueOf(res[i]));
//
//            if (i != res.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
//}
    static int hourglassSum(int[][] arr) {

        int[][] sum = new int[arr.length-2][arr[0].length-2];
        int max = -1000000;

        for(int i=0; i<arr.length-2; i++){//행
            for(int j=0; j<arr[i].length-2;j++){//열,움직임,합
                sum[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                			+arr[i+1][j+1]
                			+arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(max<sum[i][j]){
                    max=sum[i][j];
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	int[][] arr = new int[][]{ 
    		{-1, 1, -1, 0, 0, 0},
    		{0, -1, 0, 0, 0, 0},
    		{-1, -1, -1, 0, 0, 0},
    		{0, -9, 2, -4, -4, 0},
    		{-7, 0, 0, -2, 0, 0},
    		{0, 0, -1, -2, -4, 0}};
    	

    	int result = hourglassSum(arr);
    	System.out.println(result);
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//
//        int result = hourglassSum(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}