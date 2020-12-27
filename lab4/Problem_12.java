package lab4;

public class Problem_12 {
	/*
	 * ATTENTON:
	 * In this program, we do not consider the repeat numbers
	 * For example:
	 * In arr[] = { 11, 24, 20, 9, 24, 13, 2, 19 }, we consider the second biggest number is 20
	 * 
	 * If you want the program to consider the repeat numbers, you should modify code as following:
	 * 
	 *  in the second for loop:
	 *		for (int i = 0; i < arr.length - 1; i++) {
	 *  		temp_array[i] = arr[i];
	 *       }
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 24, 20, 9, 24, 13, 2, 19 };
		
		System.out.println("Get second biggest number: "+getSecondBiggestNum(arr));
		System.out.println("Time complexity: "+"O(3n) (n is the length of the array)");
	}
	
	//getSecondBiggestNum code
	public static int getSecondBiggestNum(int[] arr) {
		int temp;
		int[] temp_array = new int[arr.length - 1];
		
		// using bubble sort to find the biggest element
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
		// using a temporary array to store the elements except the biggest element
		for (int i = 0; i < arr.length - 1; i++) {
			
			//in this program, we do not consider the repeat numbers by doing the following code
			if (arr[i] != arr[arr.length - 1]) {
				temp_array[i] = arr[i];
			}
		}
		
		
		// using bubble sort to find the second biggest element
		for (int i = 0; i < temp_array.length - 1; i++) {
			if (temp_array[i] > temp_array[i + 1]) {
				temp = temp_array[i];
				temp_array[i] = temp_array[i + 1];
				temp_array[i + 1] = temp;
			}
		}

		return temp_array[temp_array.length - 1];
	}

}
