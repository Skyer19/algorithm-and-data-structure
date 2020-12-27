package lab7;

public class Problem_19 {

	public static void main(String[] args) {
		int[] arr = { -7, -5, -3, -1, 1, 4, 6, 8, 9 };
		int[] arr0 = { -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		// Loop tests all the numbers in the array
		loop: for (int i = 0; i <= arr0.length - 1; i++) {

			// Exclude numbers beyond the array first
			if (arr0[i] < arr[0]) {
				System.out.println("Number " + arr0[i] + "  => ceil(" + arr0[i] + ") = " + arr[0] + " and floor("
						+ arr0[i] + ") = -999");
				continue loop;
			}

			// Exclude numbers beyond the array first
			if (arr0[i] > arr[arr.length - 1]) {
				System.out.println("Number " + arr0[i] + "  => ceil(" + arr0[i] + ") = -999 and floor(" + arr0[i]
						+ ") = " + arr[arr.length - 1]);
				continue loop;
			}

			// Binary search
			int high = arr.length - 1;
			int low = 0;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (arr[mid] > arr0[i]) {
					high = mid - 1;
				} else if (arr[mid] < arr0[i]) {
					low = mid + 1;
				} else if (arr[mid] == arr0[i]) {
					System.out.println("Number " + arr0[i] + "  => ceil (" + arr0[i] + ") = " + arr0[i] + " and floor ("
							+ arr0[i] + ") = " + arr0[i]);
					break;
				}
				if (low > high) {
					System.out.println("Number " + arr0[i] + "  => ceil (" + arr0[i] + ") = " + arr[mid + 1]
							+ " and floor (" + arr0[i] + ") = " + arr[mid]);
				}
			}
		}
	}
}