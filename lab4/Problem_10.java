package lab4;

import java.util.Arrays;

public class Problem_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countBucket [] = new int [10];		
		int  arr[] = {5, 0, 2, 2, 9, 1, 7, 1, 3 };
		
		System.out.println("Step 0: Count = "+Arrays.toString(countBucket));
		// using counting sort to sort it.
		for(int i = 0; i < arr.length; i++) {
			countBucket[arr[i]]++;
			
			//print out each step
			System.out.println("Step "+(i+1)+": Count = "+Arrays.toString(countBucket));
		}
	}

}
