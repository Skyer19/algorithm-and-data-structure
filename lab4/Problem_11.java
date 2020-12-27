package lab4;

import java.util.Arrays;

public class Problem_11 {

	public static void main(String[] args) {
		/*
		 * 
		 * Description: using countBucket array to store the numbers of -10~10 
		 * when element is non-negative integer numbers, countBucket[elements] = countBucket[elements] +1 
		 * when element is negative integer numbers, countBucket[Math.abs(arr[i])+10] = countBucket[Math.abs(arr[i])+10] + 1
		 * 
		 */
		int countBucket[] = new int[21];
		int arr[] = { 5, 0, 2, 4, 9, 1, 7, 1, 3, -5, 0, -2, -9, -1, -7, -1, -3 };
		
		System.out.println("Step 0: Count = "+  Arrays.toString(countBucket));
		
		// using counting sort to sort it.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				countBucket[arr[i]]++;
			} else {
				countBucket[Math.abs(arr[i]) + 10]++;
			}

			// print out each step
			System.out.println("Step " + (i+1) + ": Count = " + Arrays.toString(countBucket));
		}

		System.out.println(Arrays.toString(countBucket));
	}

}
