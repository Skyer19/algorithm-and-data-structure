package lab5;

import java.util.Scanner;
/*
 * input k
 * Given a binary array, find the maximum sequence of continuous 1's that can be formed by replacing at most k zeros by ones
 */
public class Problem_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };

		int k = sc.nextInt();
		int begin = 0; // begin index of sub array
		int last = 0;  // end index of sub array
		int len = 0;   // length of sub array
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= i; j--) {
				
				// count the numbers of zero in array
				int num = 0;
				for (int m = i; m <= j; m++) {
					if (arr[m] == 0) {
						num++;
					}
				}
				
				// compare to choose the suitable sub array
				if (num == k && (j - i + 1) > len) {
					begin = i;
					last = j;
					len = j - i + 1;
				}
			}
		}
		System.out.println("k = " + k);
		System.out.println("The length of longest sequence is " + len + " ( from index " + begin + " to index " + last + " )");
		System.out.print("Note:");
		for (int i = 0; i < arr.length; i++) {
			if (i >= begin && i <= last) {
				System.out.print("1 ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
