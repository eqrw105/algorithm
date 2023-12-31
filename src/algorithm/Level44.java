package algorithm;

import java.util.*;
/**
 * 버블정렬
 */
public class Level44 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int x: solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
	
	private static int[] solution(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
}
