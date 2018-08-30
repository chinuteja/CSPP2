/**
 * { item_description }.
 *@author : Teja
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { var_description }.
	 */
	public static final Scanner s = new Scanner(System.in);
	/**
	 * Reads a matrix.
	 *
	 * @param      s1    The s 1
	 * @param      s2    The s 2
	 *
	 * @return     { returns int type }
	 */
	public static int[][] readMatrix(int s1, int s2){
        int[][] arr1 = new int[s1][s2];
        for (int i = 0; i < s1; i++) {
        	for (int j = 0; j < s2; j++) {
        		arr1[i][j] = s.nextInt();
        	}
        }
        return arr1;
	}
	public static void main(String[] args) {
       
		int s1 = s.nextInt();
        int s2 = s.nextInt();
        int[][] arr1 = readMatrix(s1, s2);
        int s3 = s.nextInt();
        int s4 = s.nextInt();
        int[][] arr2 = readMatrix(s3, s4);
        int[][] arr = new int[s1][s2];
        if (s1 != s3 && s2 != s4) {
        	System.out.println("not possible");
        }
        else {
        	for (int i = 0; i < s1; i++) {
        		for (int j = 0; j < s2; j++) {
        			arr[i][j] = arr1[i][j] + arr2[i][j];
        		}
        	}
            for (int i = 0; i < s1; i++) {
            	for (int j = 0; j < s2; j++) {
            		System.out.print(arr[i][j]);
            		if (j != s2-1) {
            			System.out.print(" ");
            		}
            	}
            	System.out.println();
            }  
        }  
	}
}