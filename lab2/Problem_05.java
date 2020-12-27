package lab2;

public class Problem_05 {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 5, 6, 7, 7, 9, 3, 2 };
		int specify_num = 5;
		int count = 0;
		
		// count the number of specify_num
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == specify_num) {
				count++;
			}
		}
		
		// shift the elements in the array 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == specify_num) {
				for (int j = i + 1; j < arr.length; j++) {
					arr[j - 1] = arr[j];
				}
			}
		}
		
		// fill the specify_num i the array arr[]
		for (int i = arr.length - count; i < arr.length; i++) {
			arr[i] = specify_num;
		}
		
		//output the array
		System.out.print("{");
		for(int i = 0; i < arr.length; i ++) {
			if(i!= 0) System.out.print(", ");
			System.out.print(arr[i]);
			
		}
		System.out.print("}");
	}

}
