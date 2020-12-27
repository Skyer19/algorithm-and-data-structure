package lab2;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 3, 5, 6, 7, 7, 9, 3, 2 };
		int specify_num = 5;
		int count = 0;
		//count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == specify_num) {
				count++;
			}
		}

		int arr1[] = new int[arr.length - count];
		
		int k = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != specify_num) {
					arr1[k++] = arr[i];
				}
			}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length - count; j++) {
				arr2[i] = arr1[i];
			}
			for (int j = arr2.length - count; j < arr2.length; j++) {
				arr2[j] = specify_num;
			}
		}
		
		//output
		System.out.print("{");
		for (int i = 0; i < arr2.length; i++) {
			if (i == 8) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + " ");
			}
		}
		System.out.print("}");
	}

}

