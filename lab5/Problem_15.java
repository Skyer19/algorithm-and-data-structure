package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_15 {
	/*
	 * input i and j (i < j), m 
	 * reverse every group of consecutive m elements in given sub-array [i, j]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while (true) {

			// input i, j and m
			int i = sc.nextInt();
			int j = sc.nextInt();
			int m = sc.nextInt();

			// the length of sub-array less than m
			if ((j - i + 1) < m) {
				System.out.println(Arrays.toString(arr));
				continue;
			}

			// the length of sub-array equal and larger than m
			int len = (j - i + 1) / m;

			// print elements before i
			for (int k = 0; k < i; k++) {
				System.out.print(arr[k] + " ");
			}

			// print elements between i and i+ m*len
			System.out.print("[");
			int count = 1;
			while (count <= len) {
				for (int k = i + count * m - 1; k >= i + (count - 1) * m; k--) {
					System.out.print(arr[k] + " ");
				}
				count++;
			}
			System.out.print("]");

			// print elements after i+ m * len
			for (int k = i + m * len; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}

		}
	}
}
