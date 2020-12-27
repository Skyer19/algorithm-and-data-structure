package lab2;

public class Problem_04 {

	public static void main(String[] args) {
		int arr[] = { 5, 3, -4, 3, -6, 2, 5, 9, -2, 3, 2 };
		int specify_num = 8;
		int start[] = new int[arr.length];
		int end[] = new int[arr.length];
		int k = 0;

		// find the sub array which suit the condition
		for (int i = 0; i < arr.length - 1; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == specify_num) {
					start[k] = i;
					end[k] = j;
					k++;
				}
			}
		}

		// find the sub array which has maximum length
		int max = Integer.MIN_VALUE;
		int position = 0;

		for (int i = 0; i < k; i++) {
			if ((end[i] - start[i]) > max) {
				max = end[i] - start[i];
				position = i;
			}
		}

		// print the array
		System.out.print("The sum of this subarray {");
		for (int i = start[position]; i <= end[position]; i++) {
			if (i != 0)
				System.out.print(", ");
			System.out.print(arr[i]);
		}
		System.out.print(" } is 8 and its length as " + (max + 1));
	}

}
