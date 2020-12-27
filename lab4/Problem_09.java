package lab4;

public class Problem_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 20, 9, 24, 13, 2, 19 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			
			// a special form to display the sorted elements and the no-sorted elements
			System.out.print("Step " + i + ": arr = [ ");
			for (int m = 0; m < n; m++) {
				System.out.print(arr[m] + " ");
				if (m == i - 1) {
					System.out.print("| "); // distinguish between sorted elements and unsorted elements
				}
			}
			System.out.print("]");

			int k = i;
			
			//traverse backwards in turn to find the smallest number
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[k]) {
					k = j; // assign the min_position to the valuable k
				}
			}
			
			// swap the smallest elements which counts form arr[i] to arr[i]
			if (k != i) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
			
			//print the min_position
			if (i != n - 1) {
				System.out.println(" and min_position = " + k);
			}
		}
	}

}
